package dagger.worker;

import androidx.work.Worker;

import java.util.Map;

import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.Multibinds;

@Module
public abstract class AndroidWorkerInjectionModule {

    @Multibinds
    abstract Map<Class<? extends Worker>, AndroidInjector.Factory<? extends Worker>>
    workerInjectorFactories();
}
