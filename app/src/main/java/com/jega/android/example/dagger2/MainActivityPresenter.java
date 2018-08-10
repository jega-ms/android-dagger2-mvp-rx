package com.jega.android.example.dagger2;

import com.jega.android.example.dagger2.account.AccountManager;

import javax.inject.Inject;

public class MainActivityPresenter {

    private AccountManager accountManager;

    @Inject
    public MainActivityPresenter(MainActivityView view,AccountManager accountManager) {
        this.accountManager = accountManager;
    }

    public boolean isSignedUp() {
        return accountManager.isSignedUp();
    }
}
