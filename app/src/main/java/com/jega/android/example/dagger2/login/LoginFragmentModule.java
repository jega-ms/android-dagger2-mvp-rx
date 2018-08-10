package com.jega.android.example.dagger2.login;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class LoginFragmentModule {

    @Binds
    abstract LoginView activityLoginFragment(LoginFragment login);
}
