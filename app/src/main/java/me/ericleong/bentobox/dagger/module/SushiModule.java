package me.ericleong.bentobox.dagger.module;

import java.util.concurrent.Callable;

import javax.inject.Singleton;

import dagger.Lazy;
import dagger.Module;
import dagger.Provides;
import io.reactivex.Observable;
import me.ericleong.bentobox.model.Fish;
import me.ericleong.bentobox.model.Rice;
import me.ericleong.bentobox.model.Sushi;

/**
 * Created by Eric on 9/26/2017.
 */
@Module
public class SushiModule {
    @Provides
    Fish providesFish() {
        return new Fish();
    }
    @Provides
    Rice providesRice() {
        return new Rice();
    }
    @Provides
    Sushi providesSushi(final Fish fish, final Rice rice) {
        return new Sushi(fish, rice);
    }
    @Singleton
    @Provides
    Observable<Sushi> providesSushiObservable(final Lazy<Sushi> sushiLazy) {
        return Observable.fromCallable(new Callable<Sushi>() {
            @Override
            public Sushi call() throws Exception {
                return sushiLazy.get();
            }
        });
    }
}