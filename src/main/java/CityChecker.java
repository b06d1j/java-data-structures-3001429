import java.util.HashMap;
import java.util.Map;

public class CityChecker {

    private static final Map<String, String> cityMap = new HashMap<>();

    static {
        // Populate the cityMap with state-city mappings
        cityMap.put("New York", "Albany");
        cityMap.put("California", "Sacramento");
        // Add more state-city pairs as needed
    }

    public static String getCityForState(String state) {
        return cityMap.get(state);
    }
}
