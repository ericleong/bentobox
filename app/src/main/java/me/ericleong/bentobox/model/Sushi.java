package me.ericleong.bentobox.model;

import android.support.annotation.StringRes;
import android.util.Log;

import me.ericleong.bentobox.R;

/**
 * Created by Eric on 9/26/2017.
 */

public class Sushi {
    public Sushi(Fish fish, Rice rice) {

    }

    @StringRes
    public int swim() {
        Log.w("Sushi", "Swimming!");
        return R.string.sushi;
    }
}
