package com.ga.school;

public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student("hasan","ali","salman",3.2);
        System.out.println(s1.toString());
        Teacher t1 = new Teacher("hasan", "Ali");

        ClassRoom c1 = new ClassRoom("TM205",t1);
        System.out.println(c1.toString());

    }
}
