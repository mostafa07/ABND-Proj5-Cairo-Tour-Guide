package com.example.android.cairotourguide;

import android.content.res.TypedArray;


public class HotelsFragment extends CategoryAbstractFragment {

    /**
     * Constructor
     */
    public HotelsFragment() {
        // Required empty public constructor
    }

    /**
     * Overridden methods
     */
    @Override
    void populateLocationsList() {
        String[] locationsNames = getResources().getStringArray(R.array.hotels_names);
        String[] locationsAddresses = getResources().getStringArray(R.array.hotels_addresses);
        String[] locationsPhoneNumbers = getResources().getStringArray(R.array.hotels_phone_numbers);
        TypedArray locationsImagesResIds = getResources().obtainTypedArray(R.array.hotels_images);

        for (int i = 0; i < locationsNames.length; ++i) {
            locationsList.add(new Location(locationsNames[i],
                    locationsAddresses[i],
                    getString(R.string.location_open_24_hours),
                    locationsPhoneNumbers[i],
                    getString(R.string.location_wiki_url_not_provided_text),
                    locationsImagesResIds.getResourceId(i, 0)));
        }

        locationsImagesResIds.recycle();
    }
}