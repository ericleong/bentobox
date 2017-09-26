package me.ericleong.bentobox.dagger.component;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import me.ericleong.bentobox.dagger.module.AndroidBindingModule;
import me.ericleong.bentobox.App;
import me.ericleong.bentobox.dagger.module.AppModule;
import me.ericleong.bentobox.dagger.module.RiceBallModule;
import me.ericleong.bentobox.dagger.module.SushiModule;
import me.ericleong.bentobox.model.Cucumber;

/**
 * Created by Eric on 9/26/2017.
 */
@Singleton
@Component(modules = {
        AndroidBindingModule.class,
        SushiModule.class,
        RiceBallModule.class,
        AppModule.class
})
public interface AppComponent {
    void inject(App app);
    Cucumber getCucumber();

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(App app);

        AppComponent build();
    }
}
