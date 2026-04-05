package viikko4.lab;

public class Book {
    private String title, author;
    private Integer year;

    public Book(String t, String a, Integer y) {
        /* TODO */ 
        if (t == null || a == null || y == null || !(y > 0)) {
            throw new IllegalArgumentException(("Virheellinen tieto!"));
        }
        else {
            this.title = t;
            this.author = a;
            this.year = y;
        }
        
    }

    public String label() {
        /* TODO */ 
        return author + ": " + title + " (" + year + ")";
    }
}