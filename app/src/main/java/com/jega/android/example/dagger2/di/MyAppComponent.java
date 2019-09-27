package com.jega.android.example.dagger2.di;

import com.jega.android.example.dagger2.MainApplication;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjector;

@Singleton
@Component(modules = {MyAppModule.class})
public interface MyAppComponent  extends AndroidInjector<MainApplication> {

    @Component.Factory
    abstract class Builder implements AndroidInjector.Factory<MainApplication> {
    }
}
