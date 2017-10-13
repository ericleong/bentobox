package me.ericleong.bentobox.dagger.component;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import me.ericleong.bentobox.dagger.module.ActivityBindingModule;
import me.ericleong.bentobox.App;

/**
 * Created by Eric on 9/26/2017.
 */
@Singleton
@Component(modules = {
        AndroidInjectionModule.class,
        ActivityBindingModule.class
})
public interface AppComponent {
    void inject(App app);
}
