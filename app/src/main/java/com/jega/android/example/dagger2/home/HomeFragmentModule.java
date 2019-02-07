package com.jega.android.example.dagger2.home;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class HomeFragmentModule {

    @Binds
    abstract HomeView activityHomeView(HomeFragment home);
}
