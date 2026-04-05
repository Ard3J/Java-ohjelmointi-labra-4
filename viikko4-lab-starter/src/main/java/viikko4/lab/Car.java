package viikko4.lab;

public class Car extends Vehicle {
    private Double avgSpeedKmh;

    public Car(String name, Double s) {
        super(name);
        /* TODO */ 
        if (s == null || !(s > 0)) {
            throw new IllegalArgumentException(("Virheellinen nopeus!"));
        }
        else {
            this.avgSpeedKmh = s;
        }
    }

    public Double travelTimeHours(Double km) {
        /* TODO */ 
        if (km == null || !(km > 0)) {
            throw new IllegalArgumentException(("Virheellinen matka!"));
        }
        else {
            return km / avgSpeedKmh;
        }
    }
}