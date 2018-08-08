package com.example.android.cairotourguide;

import android.content.res.TypedArray;


public class FoodDestinationsFragment extends CategoryAbstractFragment {

    /**
     * Constructor
     */
    public FoodDestinationsFragment() {
        // Required empty public constructor
    }

    /**
     * Overridden methods
     */
    @Override
    void populateLocationsList() {
        String[] locationsNames = getResources().getStringArray(R.array.food_destinations_names);
        String[] locationsAddresses = getResources().getStringArray(R.array.food_destinations_addresses);
        String[] locationsOpeningHours = getResources().getStringArray(R.array.food_destinations_opening_hours);
        String[] locationsPhoneNumbers = getResources().getStringArray(R.array.food_destinations_phone_numbers);
        TypedArray locationsImagesResIds = getResources().obtainTypedArray(R.array.food_destinations_images);

        for (int i = 0; i < locationsNames.length; ++i) {
            locationsList.add(new Location(locationsNames[i],
                    locationsAddresses[i],
                    locationsOpeningHours[i],
                    locationsPhoneNumbers[i],
                    getString(R.string.location_wiki_url_not_provided_text),
                    locationsImagesResIds.getResourceId(i, 0)));
        }

        locationsImagesResIds.recycle();
    }
}
