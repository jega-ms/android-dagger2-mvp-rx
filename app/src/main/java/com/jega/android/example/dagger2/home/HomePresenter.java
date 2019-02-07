package com.jega.android.example.dagger2.home;

import com.jega.android.example.dagger2.account.AccountManager;

import javax.inject.Inject;

public class HomePresenter {

    private AccountManager accountManager;
    private HomeView callback;

    @Inject
    public HomePresenter(AccountManager accountManager, HomeView callback) {
        this.accountManager = accountManager;
        this.callback = callback;

    }

    public void logout() {
        accountManager.logout();
        callback.onSuccess();
    }
}
