package com.example.cocinerosapp.ui.usuario;

import android.view.View;

import com.example.cocinerosapp.CocinappAppilcation;
import com.example.cocinerosapp.data.api.WikiApiService;
import com.example.cocinerosapp.data.modelo.BaseResponse;
import com.example.cocinerosapp.data.modelo.Usuario;
import com.example.cocinerosapp.data.preferences.SharedPreferencesManager;
import com.example.cocinerosapp.data.singleton.Singleton;
import com.example.cocinerosapp.util.ApiUtil;
import com.example.cocinerosapp.util.RetrofitErrorUtil;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

public class UsuarioViewModel extends ViewModel {

    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    private WikiApiService wikiApiService = ApiUtil.obtenerWikiApiService();
    private Singleton singleton = Singleton.obtenerInstancia();
    private SharedPreferencesManager preferencesManager = CocinappAppilcation.obtenerSharedPreferencesManager();
    private MutableLiveData<Usuario> _usuario;
    private LiveData<Usuario> usuario;
    private MutableLiveData<BaseResponse> _error;
    private LiveData<BaseResponse> error;

    public UsuarioViewModel() {
        _usuario = new MutableLiveData<>();
        usuario = _usuario;
        _error = new MutableLiveData<>();
        error = _error;
    }

    LiveData<Usuario> getUsuario() {
        return usuario;
    }

    LiveData<BaseResponse> getError() {
        return error;
    }


    public void crearUsuario( String nombreUsuario, String correo, String contrasenia ) {
        Usuario usuario = new Usuario( nombreUsuario, correo,contrasenia);
        compositeDisposable.add(
                wikiApiService.crearUsuario(usuario,preferencesManager.getAuthToken())
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribeWith(new DisposableSingleObserver<Usuario>() {

                            @Override
                            public void onSuccess(Usuario usuario1) {
                                if (usuario != null) {

                                    _usuario.setValue(usuario1);
                                    singleton.setUsuarioId(usuario.getId());

                                }
                            }

                            @Override
                            public void onError(Throwable e) {
                                BaseResponse baseResponse = RetrofitErrorUtil.obtenerRetrofitError(e);
                                _error.setValue(baseResponse);
                            }
                        })
        );
        //singleton.setUsuarioId(usuario.getId());
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        if (compositeDisposable != null) {
            compositeDisposable.clear();
            compositeDisposable = null;
        }
    }
}
