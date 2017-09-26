package me.ericleong.bentobox.dagger.component;

import com.google.common.util.concurrent.ListenableFuture;

import dagger.producers.ProductionComponent;
import me.ericleong.bentobox.Logger;
import me.ericleong.bentobox.dagger.module.ExecutorModule;
import me.ericleong.bentobox.dagger.module.LoggingModule;
import me.ericleong.bentobox.dagger.module.SaladModule;
import me.ericleong.bentobox.model.Salad;

/**
 * Created by Eric on 9/26/2017.
 */
@ProductionComponent(
        dependencies = AppComponent.class,
        modules = {
                ExecutorModule.class,
                SaladModule.class,
                LoggingModule.class
        })
public interface AppProductionComponent {
    ListenableFuture<Salad> getSalad();
    ListenableFuture<Logger> getLogger();
}
