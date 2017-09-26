package me.ericleong.bentobox.dagger.module;

import dagger.Module;
import dagger.Provides;
import dagger.producers.Produces;
import me.ericleong.bentobox.model.Cucumber;
import me.ericleong.bentobox.model.Fish;
import me.ericleong.bentobox.model.Rice;
import me.ericleong.bentobox.model.RiceBall;

/**
 * Created by Eric on 9/26/2017.
 */
@Module
public class RiceBallModule {

    @Provides
    Cucumber producesCucumber() {
        return new Cucumber();
    }

    @Provides
    RiceBall producesRiceBall(Fish fish, Rice rice, Cucumber cucumber) {
        return new RiceBall(fish, rice, cucumber);
    }
}
