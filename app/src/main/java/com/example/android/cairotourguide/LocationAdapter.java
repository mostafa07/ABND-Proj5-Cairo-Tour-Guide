package com.example.android.cairotourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;


public class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(@NonNull Context context, @NonNull List<Location> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.location_grid_item, parent, false);
        }

        Location currentLocation = getItem(position);

        ImageView image = (ImageView) convertView.findViewById(R.id.grid_item_image);
        TextView text = (TextView) convertView.findViewById(R.id.grid_item_text);

        if (currentLocation.getName() != null) {
            text.setText(currentLocation.getName());
        } else {
            text.setText(R.string.location_info_not_available);
        }

        if (currentLocation.hasImage()) {
            Glide.with(getContext()).load(currentLocation.getImgResId()).into(image);
            image.setVisibility(View.VISIBLE);
        } else {
            image.setImageResource(R.mipmap.ic_launcher);
            image.setVisibility(View.VISIBLE);
        }

        return convertView;
    }
}
