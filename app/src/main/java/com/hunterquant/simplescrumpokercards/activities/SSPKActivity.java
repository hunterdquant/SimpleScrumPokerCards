package com.hunterquant.simplescrumpokercards.activities;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.WindowManager;

import com.hunterquant.simplescrumpokercards.R;
import com.hunterquant.simplescrumpokercards.fragments.CardGridFragment;

public class SSPKActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        setContentView(R.layout.activity_sspk);
        Log.d("HERE", "Calling grid frag");
        CardGridFragment cgf = new CardGridFragment();

        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.content, cgf);
        transaction.commit();
    }
}
