package com.ga.school;

public class Student extends Person implements StudentRole {
    private String thirdName;
    private double currentGrade;

    public Student(String firstname, String lastName, String thirdName) {
        super(firstname, lastName);
        this.thirdName = thirdName;
    }

    public Student(String firstname, String lastName, String thirdName, double currentGrade) {
        super(firstname, lastName);
        this.thirdName = thirdName;
        this.currentGrade = currentGrade;
    }

    @Override
    public void Learn() {}

    @Override
    public String toString() {
        return "Student{" +
                "thirdName='" + thirdName + '\'' +
                ", currentGrade=" + currentGrade +
                '}';
    }
}
