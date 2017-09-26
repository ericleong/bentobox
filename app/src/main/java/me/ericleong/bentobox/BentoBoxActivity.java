package me.ericleong.bentobox;

import android.app.Activity;
import android.os.Bundle;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import me.ericleong.bentobox.model.Sushi;

public class BentoBoxActivity extends Activity {

    @Inject
    Sushi sushi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bento_box);
        sushi.swim();
    }
}
