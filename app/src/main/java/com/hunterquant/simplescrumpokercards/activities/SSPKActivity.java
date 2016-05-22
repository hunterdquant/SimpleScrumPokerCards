package com.hunterquant.simplescrumpokercards.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import com.hunterquant.simplescrumpokercards.R;
import com.hunterquant.simplescrumpokercards.adapters.CardAdapter;

public class SSPKActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sspk);

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new CardAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                Toast.makeText(SSPKActivity.this, "" + position,
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
