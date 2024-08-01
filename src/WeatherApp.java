import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.net.HttpURLConnection;

public class WeatherApp {

    public static JSONObject getWeatherData(String locationName) {
        JSONArray locationData = getLocationData(locationName);

        return new JSONObject();
    }

    public static JSONArray getLocationData(String locationName) {

        locationName = locationName.replace(" ", "+");

        String urlString = "https://geocoding-api.open-meteo.com/v1/search?name=" +
                locationName + "&count=10&language=en&format=json";

        /*
        try {

            HttpURLConnection com = fetchApiResponse(urlString);
        } catch (Exception e) {
            System.out.println("Error");
            //e.printStackTrace();
        }

        return new JSONArray();
    }
    */

    /*
    private static HttpURLConnection fetchApiResponse(String urlString) {

        return new HttpURLConnection();
    }

     */
        return new JSONArray();
    }
}
