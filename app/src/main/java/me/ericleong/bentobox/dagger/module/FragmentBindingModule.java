package me.ericleong.bentobox.dagger.module;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import me.ericleong.bentobox.SushiFragment;

/**
 * Created by ericleong on 10/12/17.
 */
@Module
public abstract class FragmentBindingModule {
    @ContributesAndroidInjector(
            modules = SushiModule.class
    )
    abstract SushiFragment contributeSushiFragmentInjector();
}
