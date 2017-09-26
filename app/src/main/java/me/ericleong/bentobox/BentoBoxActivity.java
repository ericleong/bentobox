package me.ericleong.bentobox;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import me.ericleong.bentobox.dagger.component.AppProductionComponent;
import me.ericleong.bentobox.model.RiceBall;
import me.ericleong.bentobox.model.Salad;

public class BentoBoxActivity extends Activity {

    @Inject
    RiceBall riceBall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bento_box);

        App app = (App) getApplicationContext();
        AppProductionComponent productionComponent = app.getAppProductionComponent();

        ListenableFuture<Salad> sushiFuture =  productionComponent.getSalad();
        Futures.addCallback(sushiFuture, new FutureCallback<Salad>() {
            @Override
            public void onSuccess(@Nullable Salad salad) {
                if (salad != null) {
                    salad.dress();
                }
            }

            @Override
            public void onFailure(Throwable t) {

            }
        });

        riceBall.roll();
    }
}
