package com.jega.android.example.dagger2.worker;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class ImageDownloadManager {

    private static int selfCount = 0;

    @Inject
    public ImageDownloadManager() {

    }

    public void download() {
        Log.d("WORKER", "WORKER COUNT" + (selfCount++));
        try {
            int i = 0;
            while (i < 5) {
                Thread.sleep(5000);
                i++;
                Log.d("WORKER", "waiting ,,,,,,,,,,, " + i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
