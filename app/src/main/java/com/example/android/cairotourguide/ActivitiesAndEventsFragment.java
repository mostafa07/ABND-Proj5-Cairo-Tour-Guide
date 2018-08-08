package com.example.android.cairotourguide;

import android.content.res.TypedArray;


public class ActivitiesAndEventsFragment extends CategoryAbstractFragment {

    /**
     * Constructor
     */
    public ActivitiesAndEventsFragment() {
        // Required empty public constructor
    }

    /**
     * Overridden methods
     */
    @Override
    void populateLocationsList() {
        String[] locationsNames = getResources().getStringArray(R.array.activities_and_events_names);
        String[] locationsAddresses = getResources().getStringArray(R.array.activities_and_events_addresses);
        String[] locationsOpeningHours = getResources().getStringArray(R.array.activities_and_events_opening_hours);
        String[] locationsPhoneNumbers = getResources().getStringArray(R.array.activities_and_events_phone_numbers);
        String[] historicPlacesWikiUrls = getResources().getStringArray(R.array.activities_and_events_wiki_urls);
        TypedArray locationsImagesResIds = getResources().obtainTypedArray(R.array.activities_and_events_images);

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