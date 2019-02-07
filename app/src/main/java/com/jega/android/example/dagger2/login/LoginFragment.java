package com.jega.android.example.dagger2.login;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.jega.android.example.dagger2.R;
import com.jega.android.example.dagger2.common.BaseActivity;
import com.jega.android.example.dagger2.common.BaseFragment;
import com.jega.android.example.dagger2.home.HomeFragment;

import javax.inject.Inject;


public class LoginFragment extends BaseFragment implements LoginView {


    @Inject
    LoginPresenter presenter;


    @Override
    public void onSuccess() {
        ((BaseActivity) getActivity()).show(new HomeFragment());

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_blank_fragment2, container, false);
        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        Button button = view.findViewById(R.id.login_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.login();
            }
        });
    }

}
