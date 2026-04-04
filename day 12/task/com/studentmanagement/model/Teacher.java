package com.studentmanagement.model;

import java.util.ArrayList;

public class Teacher extends Person {
    private String subject;
    private ArrayList<Course> coursesTaught;

    public Teacher(int id, String name, int age, String subject) {
        super(id, name, age);
        this.subject = subject;
        this.coursesTaught = new ArrayList<>();
    }

    public String getSubject() {
        return subject;
    }

    public ArrayList<Course> getCoursesTaught() {
        return coursesTaught;
    }

    public void addCourse(Course course) {
        if (!coursesTaught.contains(course)) {
            coursesTaught.add(course);
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Teacher ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Subject: " + subject);
    }
}