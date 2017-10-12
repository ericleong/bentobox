package me.ericleong.bentobox;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasFragmentInjector;
import me.ericleong.bentobox.model.Sushi;

public class BentoBoxActivity extends Activity implements HasFragmentInjector {

    @Inject
    DispatchingAndroidInjector<Fragment> fragmentInjector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bento_box);

    }

    @Override
    public AndroidInjector<Fragment> fragmentInjector() {
        return fragmentInjector;
    }
}
