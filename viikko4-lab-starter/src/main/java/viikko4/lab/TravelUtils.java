package viikko4.lab;

public final class TravelUtils {
    private TravelUtils() {
    }

    public static Double sumTravelTimes(Vehicle[] arr, Double km) {
        /* TODO */ 
        Double sumTimes = 0.0;
        if (arr == null || km == null || !(km > 0)) {
            throw new IllegalArgumentException("Virheellinen arvo!");
        }
        else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != null) {
                    sumTimes = sumTimes + arr[i].travelTimeHours(km);
                }
            }
            return sumTimes;
        }
    }
}