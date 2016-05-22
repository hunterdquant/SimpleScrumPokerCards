package com.hunterquant.simplescrumpokercards.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.hunterquant.simplescrumpokercards.R;
import com.hunterquant.simplescrumpokercards.activities.SSPKActivity;
import com.hunterquant.simplescrumpokercards.adapters.CardAdapter;

/**
 * Created by hunter on 5/22/16.
 */
public class CardGridFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.card_grid_fragment, container, false);
        GridView gridview = (GridView) root.findViewById(R.id.cardGrid);
        gridview.setAdapter(new CardAdapter(getActivity()));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
            }
        });
        Log.d("HERE", "Creating grid frag");
        return root;
    }
}
