import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


public class ArrayExamples {
    public static void main(String[] args) {

      String[] weekdays = new String[7];
      System.out.println(Arrays.toString(weekdays));

      weekdays[0] = "Monday";
      System.out.println(Arrays.toString(weekdays));

      weekdays = new String[]{"Mon", "Tue", "Wed"};
      System.out.println(Arrays.toString(weekdays));

      for (String day : weekdays) {
        System.out.println("Week day: " + day);
      }

      for (int i = 0; i < weekdays.length; i++) {
        weekdays[i] = weekdays[i].toUpperCase();
      }
      System.out.println(Arrays.toString(weekdays));
//
      String state = "California";
      String city = CityChecker.getCityForState(state);

      if (city != null) {
        System.out.println("City for " + state + ": " + city);
      } else {
        System.out.println("City not found for " + state);
      }

 //
    }
  }