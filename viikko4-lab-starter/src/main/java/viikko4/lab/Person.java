package viikko4.lab;

public class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        /* TODO validate */ 
        if ((name == null) || (name.trim().isEmpty())) {
            throw new IllegalArgumentException("Väärä arvo!");
        }
        else {
            this.name = name;
        }
        if ((age < 0) || (age == null)) {
            throw new IllegalArgumentException("Väärä arvo!");
        }
        else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }
}