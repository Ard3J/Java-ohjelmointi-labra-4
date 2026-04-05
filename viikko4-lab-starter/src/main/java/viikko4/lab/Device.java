package viikko4.lab;

public abstract class Device {
    protected String name;

    public Device(String name) {
        /* TODO */ 
        if (name == null) {
            throw new IllegalArgumentException("Virheellinen nimi!");
        }
        else {
            this.name = name;
        }
    }

    public abstract Integer batteryPercent();
}