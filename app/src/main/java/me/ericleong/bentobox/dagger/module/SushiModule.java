package me.ericleong.bentobox.dagger.module;

import dagger.Module;
import dagger.Provides;
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
    Sushi providesSushi(Fish fish, Rice rice) {
        return new Sushi(fish, rice);
    }
}