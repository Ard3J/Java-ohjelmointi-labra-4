package viikko4.lab;

import java.util.LinkedList;

public class StudentRegister {
    private LinkedList<Student> students = new LinkedList<>();

    public void add(String n, Integer c) {
        /* TODO */ 
        students.add(new Student(n, c));
    }

    public LinkedList<Student> searchByName(String q) {
        /* TODO */ 
        LinkedList<Student> matches = new LinkedList<>();
        q = q.toLowerCase();
        for (int i = 0; i < students.size(); i++) {
            String name = students.get(i).getName().toLowerCase();
            if (name.contains(q)) {
                matches.add(students.get(i));
            }
        }
        return matches;
    }

    public LinkedList<Student> searchCreditsLessThan(int x) {
        /* TODO */ 
        LinkedList<Student> creditsLessThan = new LinkedList<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getCredits() < x) {
                creditsLessThan.add(students.get(i));
            }
        }
        return creditsLessThan;
    }

    public LinkedList<Student> searchCreditsGreaterOrEqual(int x) {
        /* TODO */ 
        LinkedList<Student> creditsMoreThan = new LinkedList<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getCredits() >= x) {
                creditsMoreThan.add(students.get(i));
            }
        }
        return creditsMoreThan;
    }
}