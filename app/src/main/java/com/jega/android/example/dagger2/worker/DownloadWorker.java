package com.jega.android.example.dagger2.worker;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

import javax.inject.Inject;

import dagger.worker.AndroidWorkerInjection;

public class DownloadWorker extends Worker {

    @Inject
    ImageDownloadManager mDownloadManager;

    public DownloadWorker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
        Log.d("JEGA", "doWorker 123455 ");
    }

    @NonNull
    @Override
    public Result doWork() {
        Log.d("JEGA", "doWorker 123455");
        //Inject the worker
        AndroidWorkerInjection.inject(this);

        mDownloadManager.download();
        return Result.success();
    }
}
