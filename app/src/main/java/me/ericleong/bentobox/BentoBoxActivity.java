package me.ericleong.bentobox;

import android.app.Activity;
import android.os.Bundle;

import java.util.concurrent.Callable;

import javax.inject.Inject;

import dagger.Lazy;
import dagger.android.AndroidInjection;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import me.ericleong.bentobox.model.Sushi;

public class BentoBoxActivity extends Activity {

    @Inject
    Lazy<Sushi> sushiLazy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bento_box);

        Observable.fromCallable(
                new Callable<Sushi>() {
                    @Override
                    public Sushi call() throws Exception {
                        return sushiLazy.get();
                    }
                })
                .subscribeOn(Schedulers.computation())
                .subscribe(new Consumer<Sushi>() {
                    @Override
                    public void accept(Sushi sushi) throws Exception {
                        sushi.swim();
                    }
                });
    }
}
