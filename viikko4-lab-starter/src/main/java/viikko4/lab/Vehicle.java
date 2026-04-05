package viikko4.lab;

public abstract class Vehicle {
    protected String name;

    public Vehicle(String name) {
        /* TODO */ 
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Virheellinen nimi!");
        }
        else {
            this.name = name;
        }
    }

    public abstract Double travelTimeHours(Double km);
}