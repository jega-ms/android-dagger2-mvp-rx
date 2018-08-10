package com.jega.android.example.dagger2;

import android.app.Activity;

import com.jega.android.example.dagger2.login.LoginFragment;
import com.jega.android.example.dagger2.login.LoginFragmentModule;
import com.jega.android.example.dagger2.login.LoginView;

import dagger.Binds;
import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class MainActivityModule {

    @ContributesAndroidInjector(modules = LoginFragmentModule.class)
    abstract LoginFragment LoginFragmentInjector();


//    @ContributesAndroidInjector(modules = HomeFragment.class)
//    abstract HomeFragment homeFragmentInjector();



    @Binds
    abstract MainActivityView bindMainActivityView(MainActivity mainActivity);

    @Binds
    abstract Activity activity(MainActivity mainActivity);

}
