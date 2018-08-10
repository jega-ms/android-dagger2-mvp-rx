package com.jega.android.example.dagger2.di;

import com.jega.android.example.dagger2.MainActivity;
import com.jega.android.example.dagger2.MainActivityModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MyActivityModule {

    /**
     * Injector
     *
     * @return
     */
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity accountActivityInjector();

}
