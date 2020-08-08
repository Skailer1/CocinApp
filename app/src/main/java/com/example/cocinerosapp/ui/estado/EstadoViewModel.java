package com.example.cocinerosapp.ui.estado;


import com.example.cocinerosapp.CocinappAppilcation;
import com.example.cocinerosapp.data.api.WikiApiService;
import com.example.cocinerosapp.data.modelo.BaseResponse;
import com.example.cocinerosapp.data.modelo.EstadoPedido;
import com.example.cocinerosapp.data.preferences.SharedPreferencesManager;
import com.example.cocinerosapp.util.ApiUtil;
import com.example.cocinerosapp.util.RetrofitErrorUtil;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

public class EstadoViewModel extends ViewModel {

    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    private WikiApiService wikiApiService = ApiUtil.obtenerWikiApiService();
    private SharedPreferencesManager preferencesManager = CocinappAppilcation.obtenerSharedPreferencesManager();
    private MutableLiveData<EstadoPedido> _estado;
    private LiveData<EstadoPedido> estado;
    private MutableLiveData<BaseResponse> _error;
    private LiveData<BaseResponse> error;

    public EstadoViewModel() {
        _estado = new MutableLiveData<>();
        estado = _estado;
        _error = new MutableLiveData<>();
        error = _error;
    }

    LiveData<EstadoPedido> getEstado() {
        return estado;
    }

    LiveData<BaseResponse> getError() {
        return error;
    }


    public void actualizarEstado(String descripcionEstado) {
        EstadoPedido estado = new EstadoPedido( descripcionEstado);
        compositeDisposable.add(
                wikiApiService.actualizarEstado(estado.getId(),estado, preferencesManager.getAuthToken())
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribeWith(new DisposableSingleObserver<EstadoPedido>() {

                            @Override
                            public void onSuccess(EstadoPedido estado1) {
                                if (estado != null) {

                                    _estado.setValue(estado1);


                                }
                            }

                            @Override
                            public void onError(Throwable e) {
                                BaseResponse baseResponse = RetrofitErrorUtil.obtenerRetrofitError(e);
                                _error.setValue(baseResponse);
                            }
                        })
        );
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

