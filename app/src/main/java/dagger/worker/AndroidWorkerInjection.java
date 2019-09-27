package dagger.worker;

import androidx.work.Worker;

import dagger.android.AndroidInjector;

import static dagger.internal.Preconditions.checkNotNull;

public class AndroidWorkerInjection {

    public static void inject(Worker worker) {
        checkNotNull(worker, "worker");
        Object application = worker.getApplicationContext();
        if (!(application instanceof HasWorkerInjector)) {
            throw new RuntimeException(
                    String.format(
                            "%s does not implement %s",
                            application.getClass().getCanonicalName(),
                            HasWorkerInjector.class.getCanonicalName()));
        }

        AndroidInjector<Worker> workerInjector =
                ((HasWorkerInjector) application).workerInjector();
        checkNotNull(workerInjector, "%s.workerInjector() returned null", application.getClass());
        workerInjector.inject(worker);
    }
}
