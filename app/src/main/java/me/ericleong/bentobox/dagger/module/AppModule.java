package me.ericleong.bentobox.dagger.module;

import dagger.Module;
import dagger.Provides;
import me.ericleong.bentobox.App;
import me.ericleong.bentobox.DeferredLogger;
import me.ericleong.bentobox.Logger;

/**
 * Created by Eric on 9/26/2017.
 */
@Module
public class AppModule {
    @Provides
    Logger providesLogger(App app) {
        return new DeferredLogger(app.getAppProductionComponent().getLogger());
    }
}
