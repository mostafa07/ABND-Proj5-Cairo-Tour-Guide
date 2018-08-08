package com.example.android.cairotourguide;

import android.content.res.TypedArray;


public class HistoricPlacesFragment extends CategoryAbstractFragment {

    /**
     * Constructor
     */
    public HistoricPlacesFragment() {
        // Required empty public constructor
    }

    /**
     * Overridden methods
     */
    @Override
    void populateLocationsList() {
        String[] locationsNames = getResources().getStringArray(R.array.historic_places_names);
        String[] locationsAddresses = getResources().getStringArray(R.array.historic_places_addresses);
        String[] locationsOpeningHours = getResources().getStringArray(R.array.historic_places_opening_hours);
        String[] locationsPhoneNumbers = getResources().getStringArray(R.array.historic_places_phone_numbers);
        String[] historicPlacesWikiUrls = getResources().getStringArray(R.array.historic_places_wiki_urls);
        TypedArray locationsImagesResIds = getResources().obtainTypedArray(R.array.historic_places_images);

        for (int i = 0; i < locationsNames.length; ++i) {
            locationsList.add(new Location(locationsNames[i],
                    locationsAddresses[i],
                    locationsOpeningHours[i],
                    locationsPhoneNumbers[i],
                    historicPlacesWikiUrls[i],
                    locationsImagesResIds.getResourceId(i, 0)));
        }

        locationsImagesResIds.recycle();
    }
}
