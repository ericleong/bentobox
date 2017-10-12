package me.ericleong.bentobox.dagger.component;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import me.ericleong.bentobox.dagger.module.AndroidBindingModule;
import me.ericleong.bentobox.App;
import me.ericleong.bentobox.dagger.module.SushiModule;

/**
 * Created by Eric on 9/26/2017.
 */
@Component(modules = {
        AndroidInjectionModule.class,
        AndroidBindingModule.class
})
public interface AppComponent {
    void inject(App app);
}
