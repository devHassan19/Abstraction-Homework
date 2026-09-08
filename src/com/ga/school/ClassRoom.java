package com.ga.school;

import java.util.List;

public class ClassRoom {
    private String className;
    List<Student> studentList;
    private  Teacher teacher;

    public ClassRoom(String className, Teacher teacher) {
        this.className = className;
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "ClassRoom{" +
                "className='" + className + '\'' +
                ", studentList=" + studentList +
                ", teacher=" + teacher +
                '}';
    }
}
