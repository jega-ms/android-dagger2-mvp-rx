package com.jega.android.example.dagger2.login;


import com.jega.android.example.dagger2.account.AccountManager;

import javax.inject.Inject;

public class LoginPresenter {

    private AccountManager accountManager;
    private LoginView callback;

    @Inject
    public LoginPresenter(AccountManager accountManager, LoginView callback) {
        this.accountManager = accountManager;
        this.callback = callback;

    }

    public void login() {
        accountManager.login();
        callback.onSuccess();

    }
}
