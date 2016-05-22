package com.hunterquant.simplescrumpokercards.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.hunterquant.simplescrumpokercards.R;

/**
 * Created by hunter on 5/22/16.
 */
public class CardAdapter extends BaseAdapter {

    private Context context;

    private int[] cardIds = {
            R.drawable.card0,
            R.drawable.card1,
            R.drawable.card2,
            R.drawable.card3,
            R.drawable.card5,
            R.drawable.card8,
            R.drawable.card13,
            R.drawable.card21
    };

    public CardAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return cardIds.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return cardIds[position];
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {
            imageView = new ImageView(context);
            imageView.setLayoutParams(new GridView.LayoutParams(500, 500));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(cardIds[position]);
        return imageView;
    }
}
