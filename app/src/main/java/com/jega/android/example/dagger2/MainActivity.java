package com.jega.android.example.dagger2;

import android.os.Bundle;

import com.jega.android.example.dagger2.common.BaseActivity;
import com.jega.android.example.dagger2.home.HomeFragment;
import com.jega.android.example.dagger2.login.LoginFragment;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements  MainActivityView {

    @Inject
    MainActivityPresenter presenter;

    LoginFragment login = new LoginFragment();

   // @Inject
    HomeFragment home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (presenter.isSignedUp()) {
            //show fragment 2
            show(home);
        } else {
            // show fragment 1
            show(login);
        }
    }

    @Override
    public int getContainerId() {
        return R.id.activity_container;
    }

    @Override
    public void test() {

    }
}
