package com.jega.android.example.dagger2;

import com.jega.android.example.dagger2.di.DaggerMyAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

public class MainApplication extends DaggerApplication {


    @Override
    public void onCreate() {
        super.onCreate();
        //   DaggerMyAppComponent.builder().create(this).inject(this);


    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerMyAppComponent.builder().create(this);
    }

}
