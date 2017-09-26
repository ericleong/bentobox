package me.ericleong.bentobox;

import android.app.Activity;
import android.app.Application;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import me.ericleong.bentobox.dagger.component.AppComponent;
import me.ericleong.bentobox.dagger.component.AppProductionComponent;
import me.ericleong.bentobox.dagger.component.DaggerAppComponent;
import me.ericleong.bentobox.dagger.component.DaggerAppProductionComponent;

/**
 * Created by Eric on 9/26/2017.
 */
public class App extends Application implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    AppProductionComponent appProductionComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        AppComponent appComponent = DaggerAppComponent.builder().application(this).build();
        appComponent.inject(this);
        appProductionComponent = DaggerAppProductionComponent.builder()
                .appComponent(appComponent)
                .build();
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }

    public AppProductionComponent getAppProductionComponent() {
        return appProductionComponent;
    }
}
