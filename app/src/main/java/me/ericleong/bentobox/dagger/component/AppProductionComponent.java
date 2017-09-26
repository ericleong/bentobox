package me.ericleong.bentobox.dagger.component;

import com.google.common.util.concurrent.ListenableFuture;

import dagger.producers.ProductionComponent;
import me.ericleong.bentobox.dagger.module.ExecutorModule;
import me.ericleong.bentobox.dagger.module.SushiModule;
import me.ericleong.bentobox.model.Sushi;

/**
 * Created by Eric on 9/26/2017.
 */
@ProductionComponent(
        dependencies = AppComponent.class,
        modules = {
                ExecutorModule.class,
                SushiModule.class
        })
public interface AppProductionComponent {
    ListenableFuture<Sushi> getSushi();
}
