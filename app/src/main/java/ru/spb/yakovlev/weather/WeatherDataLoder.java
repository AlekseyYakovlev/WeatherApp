package ru.spb.yakovlev.weather;

import android.content.Context;

import org.json.JSONObject;

import java.net.URL;

/**
 * Created by Aleksey on 23.02.2018.
 */

public class WeatherDataLoder {
    private static final String OPEN_WEATHER_MAP_API = "http://samples.openweathermap.org/data/2.5/weather?q=%s&units=metric";
    private static final String KEY = "x-api-key";
    private static final String RESPONSE = "cod";

    private static final String NEW_LINE = "\n";
    private static final String ERROR_FROM_SERVER = "200";

    static JSONObject getJSONData (Context context, String city){
        try {
            URL url = new URL(String.format(OPEN_WEATHER_MAP_API,city));
        }catch (Exception e){
            return null;
        }
    }
}
