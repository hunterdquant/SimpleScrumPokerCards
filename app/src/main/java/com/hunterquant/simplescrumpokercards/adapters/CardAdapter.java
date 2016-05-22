package com.hunterquant.simplescrumpokercards.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.hunterquant.simplescrumpokercards.R;
import com.hunterquant.simplescrumpokercards.resources.CardResources;

/**
 * Created by hunter on 5/22/16.
 */
public class CardAdapter extends BaseAdapter {

    private Context context;

    public CardAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return CardResources.cardIds.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return CardResources.cardIds[position];
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

        imageView.setImageResource(CardResources.cardIds[position]);
        return imageView;
    }
}
