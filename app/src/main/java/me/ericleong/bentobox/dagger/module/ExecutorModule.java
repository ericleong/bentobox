package me.ericleong.bentobox.dagger.module;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import dagger.Module;
import dagger.Provides;
import dagger.producers.Production;

/**
 * Created by Eric on 6/5/2017.
 */
@Module
public class ExecutorModule {
    @Provides
    @Production
    static Executor executor() {
        return Executors.newCachedThreadPool();
    }
}
