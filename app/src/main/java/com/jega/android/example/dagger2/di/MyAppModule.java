package com.jega.android.example.dagger2.di;

import android.app.Application;
import android.content.Context;

import com.jega.android.example.dagger2.MainApplication;
import com.jega.android.example.dagger2.account.AccountManager;
import com.jega.android.example.dagger2.account.impl.AccountManagerImp;

import dagger.Binds;
import dagger.Module;
import dagger.android.support.AndroidSupportInjectionModule;

@Module(includes = {AndroidSupportInjectionModule.class, MyActivityModule.class})
public abstract class MyAppModule {

    @Binds
    abstract Application application(MainApplication app);

    @Binds
    abstract Context applicationContext(MainApplication app);

    @Binds
    abstract AccountManager accountManagerImpl(AccountManagerImp imp);


}
