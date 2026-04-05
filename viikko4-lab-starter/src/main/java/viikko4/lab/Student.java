package viikko4.lab;

public class Student {
    private String name;
    private Integer credits;

    public Student(String n, Integer c) {
        /* TODO */ 
        if (n == null || c == null || c < 0) {
            throw new IllegalArgumentException("Virheellinen tieto!");
        }
        else {
            this.name = n;
            this.credits = c;
        }
    }

    public String getName() {
        return name;
    }

    public Integer getCredits() {
        return credits;
    }
}