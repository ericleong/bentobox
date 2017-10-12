package me.ericleong.bentobox;


import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import me.ericleong.bentobox.model.Sushi;


/**
 * A simple {@link Fragment} subclass.
 */
public class SushiFragment extends Fragment {

    @Inject
    Sushi sushi;

    public SushiFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        AndroidInjection.inject(this);
        super.onAttach(context);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sushi, container, false);

        ((TextView) view.findViewById(R.id.text)).setText(sushi.swim());

        return view;
    }

}
