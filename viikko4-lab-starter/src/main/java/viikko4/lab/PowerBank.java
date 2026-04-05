package viikko4.lab;

public class PowerBank extends Device implements Rechargeable {
    private int battery;

    public PowerBank(String name, Integer b) {
        super(name);
        /* TODO */ this.battery = b;
    }

    public void recharge(Integer minutes) {
        /* TODO */ 
        if (minutes < 0) {
            throw new IllegalArgumentException("Virheellinen aika!");
        }
        else {
            battery = battery + minutes;
            if (battery > 100) {
                battery = 100;
            }
        }
    }

    public void discharge(Integer minutes) {
        /* TODO */ 
        if (minutes < 0) {
            throw new IllegalArgumentException("Virheellinen aika!");
        }
        else {
            battery = battery - minutes/3;
            if (battery < 0) {
                battery = 0;
            }
        }
    }

    public Integer batteryPercent() {
        return battery;
    }
}