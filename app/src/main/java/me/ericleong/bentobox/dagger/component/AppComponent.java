package me.ericleong.bentobox.dagger.component;

import dagger.Component;
import me.ericleong.bentobox.dagger.module.AndroidBindingModule;
import me.ericleong.bentobox.App;

/**
 * Created by Eric on 9/26/2017.
 */
@Component(modules = {
        AndroidBindingModule.class,
})
public interface AppComponent {
    void inject(App app);
}
