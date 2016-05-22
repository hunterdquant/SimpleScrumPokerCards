package com.hunterquant.simplescrumpokercards.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hunterquant.simplescrumpokercards.R;

/**
 * Created by hunter on 5/22/16.
 */
public class BaseFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.base_fragment, container, false);
        CardGridFragment cgf = new CardGridFragment();
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.replace(R.id.baseContainer, cgf);
        ft.commit();
        return root;
    }
}
