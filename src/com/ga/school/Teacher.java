package com.ga.school;

public class Teacher extends Person implements TeacherRole{
    private double salaryRate;

    public Teacher(String firstname, String lastName) {
        super(firstname, lastName);
    }



    @Override
    public String toString() {
        return "Teacher{" +
                "salaryRate=" + salaryRate +
                '}';
    }

    @Override
    public void Teacher(String name) {
        System.out.println("Teacher " + name);
    }
}
