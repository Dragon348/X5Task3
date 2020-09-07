package ru.x5.StudentTask;

public class Student {
    String firstName;
    String lastName;
    String group;
    double averegeMark;

    public Student(String firstName, String lastName, String group, double averegeMark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.group = group;
        this.averegeMark = averegeMark;
    }

    public int getScholarship() {
        if (averegeMark == 5) {
            return 100;
        } else {
            return 80;
        }
    }
}
