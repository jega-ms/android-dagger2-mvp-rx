package com.jega.android.example.dagger2.di;

import android.app.Application;
import android.content.Context;

import com.jega.android.example.dagger2.MainApplication;
import com.jega.android.example.dagger2.account.AccountManager;
import com.jega.android.example.dagger2.account.impl.AccountManagerImp;
import com.jega.android.example.dagger2.worker.DownloadWorker;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;
import dagger.worker.AndroidWorkerInjectionModule;

@Module(includes = {AndroidSupportInjectionModule.class, MyActivityModule.class, AndroidWorkerInjectionModule.class})
public abstract class MyAppModule {

    @Binds
    abstract Application application(MainApplication app);

    @Binds
    abstract Context applicationContext(MainApplication app);

    @Binds
    abstract AccountManager accountManagerImpl(AccountManagerImp imp);

    @ContributesAndroidInjector
    abstract DownloadWorker downloadWorker();

}
