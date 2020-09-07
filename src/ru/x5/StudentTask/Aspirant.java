package ru.x5.StudentTask;

public class Aspirant extends Student {
    private String study;

    public Aspirant(String firstName, String lastName, String group, double averegeMark) {
        super(firstName, lastName, group, averegeMark);
    }

    public int getScholarship() {
        if (averegeMark == 5) {
            return 200;
        } else {
            return 180;
        }
    }
}
