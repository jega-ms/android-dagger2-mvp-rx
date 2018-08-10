package com.jega.android.example.dagger2.account.impl;

import android.content.Context;

import com.jega.android.example.dagger2.account.AccountManager;

import javax.inject.Inject;

public class AccountManagerImp implements AccountManager {

    private boolean signedUp = false;

    @Inject
    public AccountManagerImp(Context context) {

    }

    @Override
    public boolean isSignedUp() {
        return signedUp;
    }

    @Override
    public void login() {
        signedUp = true;
    }

    @Override
    public void logout() {
        signedUp = false;
    }
}
