package viikko4.lab;

public class Phone extends Device implements Rechargeable {
    private int battery;

    public Phone(String name, Integer b) {
        super(name);
        /* TODO */ 
        if (b == null || b < 0 || b > 100) {
            throw new IllegalArgumentException("Virheellinen lataus!");
        }
        else {
            this.battery = b;
        }
        
    }

    public void use(Integer minutes) {
        /* TODO */ 
        if (minutes < 0) {
            throw new IllegalArgumentException("Virheellinen aika!");
        }
        else {
            battery = battery - minutes/5;
            if (battery < 0) {
                battery = 0;
            }
        }
    }

    public void recharge(Integer minutes) {
        /* TODO */ 
        if (minutes < 0) {
            throw new IllegalArgumentException("Virheellinen aika!");
        }
        else {
            battery = battery + minutes/2;
            if (battery > 100) {
                battery = 100;
            }
        }
    }

    public Integer batteryPercent() {
        return battery;
    }
}