package me.ericleong.bentobox.dagger.module;

import android.util.Log;

import dagger.producers.ProducerModule;
import dagger.producers.Produces;
import me.ericleong.bentobox.Logger;

/**
 * Created by Eric on 9/26/2017.
 */
@ProducerModule
public class LoggingModule {
    @Produces
    Logger producesLogger() {
        return new Logger() {
            @Override
            public void log(String s) {
                Log.d("Logger", s);
            }
        };
    }
}
