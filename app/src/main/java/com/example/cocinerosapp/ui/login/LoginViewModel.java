package com.example.cocinerosapp.ui.login;

import com.example.cocinerosapp.CocinappAppilcation;
import com.example.cocinerosapp.data.api.WikiApiService;
import com.example.cocinerosapp.data.modelo.AuthToken;
import com.example.cocinerosapp.data.modelo.BaseResponse;
import com.example.cocinerosapp.data.modelo.LoginRequest;
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

public class LoginViewModel extends ViewModel
{
    private CompositeDisposable compositeDisposable = new CompositeDisposable();
    private WikiApiService wikiApiService = ApiUtil.obtenerWikiApiService();
    private SharedPreferencesManager preferencesManager = CocinappAppilcation.obtenerSharedPreferencesManager();
    private MutableLiveData<AuthToken> _authToken;
    private LiveData<AuthToken> authToken;
    private MutableLiveData<BaseResponse> _error;
    private LiveData<BaseResponse> error;

    public LoginViewModel() {
        _authToken = new MutableLiveData<>();
        authToken = _authToken;
        _error = new MutableLiveData<>();
        error = _error;
    }

    LiveData<AuthToken> getAuthToken() {
        return authToken;
    }

    LiveData<BaseResponse> getError() {
        return error;
    }

    public void login(String email, String password) {
        LoginRequest loginRequest = new LoginRequest(email, password);
        compositeDisposable.add(
                wikiApiService.login(loginRequest)
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribeWith(new DisposableSingleObserver<AuthToken>() {

                            @Override
                            public void onSuccess(AuthToken authToken) {
                                if (authToken != null) {
                                    preferencesManager.setAuthToken("Bearer " + authToken.getAuthToken());
                                    _authToken.setValue(authToken);
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
