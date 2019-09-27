package com.jega.android.example.dagger2;

import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import androidx.work.Worker;

import com.jega.android.example.dagger2.di.DaggerMyAppComponent;
import com.jega.android.example.dagger2.worker.DownloadWorker;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;
import dagger.android.DispatchingAndroidInjector;
import dagger.worker.HasWorkerInjector;

public class MainApplication extends DaggerApplication implements HasWorkerInjector {

    @Inject
    DispatchingAndroidInjector<Worker> workerDispatchingAndroidInjector;


    @Override
    public void onCreate() {
        super.onCreate();

        OneTimeWorkRequest refreshProfile =
                new OneTimeWorkRequest.Builder(DownloadWorker.class)
                        .addTag("WORKTEST")
                        .build();
        WorkManager.getInstance(this).enqueue(refreshProfile);
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerMyAppComponent.factory().create(this);
    }

    @Override
    public AndroidInjector<Worker> workerInjector() {
        return workerDispatchingAndroidInjector;
    }
}
