package com.hunterquant.simplescrumpokercards.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.hunterquant.simplescrumpokercards.R;
import com.hunterquant.simplescrumpokercards.resources.CardResources;

/**
 * Created by hunter on 5/22/16.
 */
public class CardFragment extends Fragment {

    private static final String POSITION_KEY = "position";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        int position = getArguments().getInt(POSITION_KEY);
        View root = inflater.inflate(R.layout.card_fragment, container, false);
        ImageView imageView = (ImageView)root.findViewById(R.id.card);
        imageView.setImageResource(CardResources.cardIds[position]);
        return root;
    }
}
