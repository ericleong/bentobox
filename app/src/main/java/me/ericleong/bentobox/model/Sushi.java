package me.ericleong.bentobox.model;

import android.support.annotation.StringRes;
import android.util.Log;

import me.ericleong.bentobox.R;

/**
 * Created by Eric on 9/26/2017.
 */

public class Sushi {

    private Fish fish;

    public Sushi(Fish fish, Rice rice) {
        this.fish = fish;
    }

    public String swim() {
        Log.w("Sushi", "Swimming!");
        return fish.getContext().getResources().getString(R.string.sushi);
    }
}
