package me.ericleong.bentobox.dagger.module;

import dagger.Module;
import dagger.Provides;
import me.ericleong.bentobox.dagger.scopes.ActivityScope;
import me.ericleong.bentobox.model.Rice;

/**
 * Created by ericleong on 10/13/17.
 */
@Module
public class RiceModule {
    @ActivityScope
    @Provides
    Rice providesRice() {
        return new Rice();
    }
}
