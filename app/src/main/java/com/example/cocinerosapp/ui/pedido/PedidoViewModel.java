package com.example.cocinerosapp.ui.pedido;

import com.example.cocinerosapp.CocinappAppilcation;
import com.example.cocinerosapp.data.api.WikiApiService;
import com.example.cocinerosapp.data.modelo.BaseResponse;
import com.example.cocinerosapp.data.modelo.Pedido;
import com.example.cocinerosapp.data.preferences.SharedPreferencesManager;
import com.example.cocinerosapp.util.ApiUtil;
import com.example.cocinerosapp.util.RetrofitErrorUtil;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

public class PedidoViewModel extends ViewModel {

    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    private WikiApiService wikiApiService = ApiUtil.obtenerWikiApiService();
    private SharedPreferencesManager preferencesManager = CocinappAppilcation.obtenerSharedPreferencesManager();
    private MutableLiveData<List<Pedido>> _pedidos;
    private LiveData<List<Pedido>> pedidos;
    private MutableLiveData<BaseResponse> _error;
    private LiveData<BaseResponse> error;

    public PedidoViewModel() {
        _pedidos = new MutableLiveData<>();
        pedidos = _pedidos;
        _error = new MutableLiveData<>();
        error = _error;


    }

    LiveData<List<Pedido>> getPedidos() {
        return pedidos;
    }

    LiveData<BaseResponse> getError() {
        return error;
    }

    public void obtenerPedidos() {
        compositeDisposable.add(
                wikiApiService.obtenerPedidos(preferencesManager.getAuthToken())
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribeWith(new DisposableSingleObserver<List<Pedido>>() {

                            @Override
                            public void onSuccess(List<Pedido> pedidos) {
                                _pedidos.setValue(pedidos);
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
