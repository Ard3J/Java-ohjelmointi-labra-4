package viikko4.lab;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        /* TODO validate */ 
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Väärä nimi!");
        }
        else {
            this.name = name;
        }
    }

    public abstract String sound();
}