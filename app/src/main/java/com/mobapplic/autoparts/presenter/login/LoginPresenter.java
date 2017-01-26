package com.mobapplic.autoparts.presenter.login;


import com.mobapplic.autoparts.presenter.BasePresenter;
import com.mobapplic.autoparts.view.views.login.LoginView;

public interface LoginPresenter extends BasePresenter {
    void validateCredentials(String username, String password);

//    void unBindView();

    void bindView(LoginView loginView);

    interface OnLoginListener {
        void onSuccess();
        void onError();
    }
}
