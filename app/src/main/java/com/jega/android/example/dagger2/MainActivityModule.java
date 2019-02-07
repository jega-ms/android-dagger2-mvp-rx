package com.jega.android.example.dagger2;

import android.app.Activity;

import com.jega.android.example.dagger2.home.HomeFragment;
import com.jega.android.example.dagger2.home.HomeFragmentModule;
import com.jega.android.example.dagger2.login.LoginFragment;
import com.jega.android.example.dagger2.login.LoginFragmentModule;
import com.jega.android.example.dagger2.login.LoginView;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MainActivityModule {



    @Binds
    abstract MainActivityView bindMainActivityView(MainActivity mainActivity);

    @ContributesAndroidInjector(modules = LoginFragmentModule.class)
    abstract LoginFragment LoginFragmentInjector();

    @ContributesAndroidInjector(modules = HomeFragmentModule.class)
    abstract HomeFragment homeFragmentInjector();

}
