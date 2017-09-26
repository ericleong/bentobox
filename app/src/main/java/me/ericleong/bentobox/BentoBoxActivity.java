package me.ericleong.bentobox;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;

import dagger.android.AndroidInjection;
import me.ericleong.bentobox.dagger.component.AppProductionComponent;
import me.ericleong.bentobox.model.Sushi;

public class BentoBoxActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bento_box);

        App app = (App) getApplicationContext();
        AppProductionComponent productionComponent = app.getAppProductionComponent();

        ListenableFuture<Sushi> sushiFuture =  productionComponent.getSushi();
        Futures.addCallback(sushiFuture, new FutureCallback<Sushi>() {
            @Override
            public void onSuccess(@Nullable Sushi sushi) {
                if (sushi != null) {
                    sushi.swim();
                }
            }

            @Override
            public void onFailure(Throwable t) {

            }
        });
    }
}
