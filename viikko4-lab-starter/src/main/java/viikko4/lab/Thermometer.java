package viikko4.lab;

public class Thermometer implements Measurable {
    private Double celsius;

    public Thermometer(Double c) {
        /* TODO */ 
        if (c == null) {
            throw new IllegalArgumentException("Virheellinen arvo!");
        }
        else {
            this.celsius = c;
        }
    }

    public Double measure() {
        /* TODO */ return celsius;
    }
}