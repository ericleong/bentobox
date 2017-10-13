package me.ericleong.bentobox.dagger.module;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import me.ericleong.bentobox.BentoBoxActivity;
import me.ericleong.bentobox.SushiFragment;
import me.ericleong.bentobox.dagger.scopes.ActivityScope;

/**
 * Created by Eric on 9/26/2017.
 */
@Module
public abstract class ActivityBindingModule {
    @ActivityScope
    @ContributesAndroidInjector(
            modules = {
                    RiceModule.class,
                    FragmentBindingModule.class
            }
    )
    abstract BentoBoxActivity contributeBentoBoxActivityInjector();
}
