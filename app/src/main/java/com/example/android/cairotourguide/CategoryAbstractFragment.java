package com.example.android.cairotourguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;


public abstract class CategoryAbstractFragment extends Fragment {

    protected ArrayList<Location> locationsList;

    /**
     * Overridden methods
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.locations_grid, container, false);

        locationsList = new ArrayList<>();
        populateLocationsList();

        GridView gridView = rootView.findViewById(R.id.grid);
        LocationAdapter adapter = new LocationAdapter(getActivity(), locationsList);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Location clickedItem = (Location) parent.getItemAtPosition(position);
                if (clickedItem.getWikiUrl() != null && Patterns.WEB_URL.matcher(clickedItem.getWikiUrl()).matches()) {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(clickedItem.getWikiUrl()));
                    startActivity(intent);
                } else {
                    Toast.makeText(getActivity(), getString(R.string.location_wiki_url_not_provided_text), Toast.LENGTH_LONG).show();
                }
            }
        });

        return rootView;
    }

    /**
     * Other methods
     */
    abstract void populateLocationsList();
}
