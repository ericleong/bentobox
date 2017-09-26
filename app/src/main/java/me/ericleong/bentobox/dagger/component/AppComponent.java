package me.ericleong.bentobox.dagger.component;

import javax.inject.Singleton;

import dagger.Component;
import me.ericleong.bentobox.dagger.module.AndroidBindingModule;
import me.ericleong.bentobox.App;
import me.ericleong.bentobox.dagger.module.SushiModule;

/**
 * Created by Eric on 9/26/2017.
 */
@Singleton
@Component(modules = {
        AndroidBindingModule.class
})
public interface AppComponent {
    void inject(App app);
}
