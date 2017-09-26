package me.ericleong.bentobox.dagger.module;

import dagger.producers.ProducerModule;
import dagger.producers.Produces;
import me.ericleong.bentobox.model.Fish;
import me.ericleong.bentobox.model.Rice;
import me.ericleong.bentobox.model.Sushi;

/**
 * Created by Eric on 9/26/2017.
 */
@ProducerModule
public class SushiModule {
    @Produces
    Fish providesFish() {
        return new Fish();
    }
    @Produces
    Rice providesRice() {
        return new Rice();
    }
    @Produces
    Sushi providesSushi(final Fish fish, final Rice rice) {
        return new Sushi(fish, rice);
    }
}