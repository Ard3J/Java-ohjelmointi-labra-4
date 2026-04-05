package viikko4.lab;

public class DeviceUtils {
    private DeviceUtils() {
    }

    public static int averageBattery(Device[] ds) {
        /* TODO */ 
        int totalBattery = 0;
        int numberDevices = 0;
        if (ds == null || ds.length == 0) {
            throw new IllegalArgumentException("Virheellinen array!");
        }
        else {
            for (int i = 0; i < ds.length; i++) {
                if (ds[i] != null) {
                    totalBattery = totalBattery + ds[i].batteryPercent();
                    numberDevices++;
                }
            }
            if (numberDevices == 0) {
                throw new IllegalArgumentException("Tyhjä array!");
            }
            else {
                return totalBattery/numberDevices;
            }
        }
    }
}