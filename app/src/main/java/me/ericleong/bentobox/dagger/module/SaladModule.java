package me.ericleong.bentobox.dagger.module;

import dagger.producers.ProducerModule;
import dagger.producers.Produces;
import me.ericleong.bentobox.model.Cucumber;
import me.ericleong.bentobox.model.Salad;
import me.ericleong.bentobox.model.Tomato;

/**
 * Created by Eric on 9/26/2017.
 */
@ProducerModule
public class SaladModule {


    @Produces
    Tomato producesTomato() {
        return new Tomato();
    }

    @Produces
    Salad producesSalad(Cucumber cucumber, Tomato tomato) {
        return new Salad(cucumber, tomato);
    }
}
