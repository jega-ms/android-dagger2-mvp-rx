package com.jega.android.example.dagger2.home;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.jega.android.example.dagger2.R;
import com.jega.android.example.dagger2.common.BaseActivity;
import com.jega.android.example.dagger2.common.BaseFragment;
import com.jega.android.example.dagger2.login.LoginFragment;

import javax.inject.Inject;


public class HomeFragment extends BaseFragment implements HomeView {

    @Inject
    HomePresenter homePresenter;


    @Override
    public void onSuccess() {
        ((BaseActivity) getActivity()).show(new LoginFragment());
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        // return super.onCreateView(inflater, container, savedInstanceState);
        View rootView = inflater.inflate(R.layout.fragment_blank, container, false);
        return rootView;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        Button logout = view.findViewById(R.id.logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                homePresenter.logout();
            }
        });
    }
}
