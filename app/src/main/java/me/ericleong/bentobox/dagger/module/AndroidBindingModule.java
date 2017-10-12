package me.ericleong.bentobox.dagger.module;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import me.ericleong.bentobox.BentoBoxActivity;
import me.ericleong.bentobox.SushiFragment;

/**
 * Created by Eric on 9/26/2017.
 */
@Module
public abstract class AndroidBindingModule {
    @ContributesAndroidInjector
    abstract BentoBoxActivity contributeBentoBoxActivityInjector();

    @ContributesAndroidInjector(
            modules = SushiModule.class
    )
    abstract SushiFragment contributeSushiFragmentInjector();
}
