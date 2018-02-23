package ru.spb.yakovlev.weather;

import android.app.Activity;
import android.content.SharedPreferences;

/**
 * Created by Aleksey on 23.02.2018.
 */

public class CityPreference {
    private static final String KEY = "city";
    private static final String MOSCOW = "Moscow";
    private SharedPreferences userPreferances;

    CityPreference(Activity activity) {
        userPreferances = activity.getPreferences(Activity.MODE_PRIVATE);
    }

    String getCity() {
        return userPreferances.getString(KEY, MOSCOW);
    }

    void setCity (String city){
        userPreferances.edit().putString(KEY,city).apply();
    }
}
