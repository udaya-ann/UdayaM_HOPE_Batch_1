package com.studentmanagement.model;

import java.util.ArrayList;

public class Student extends Person {
    private String department;
    private ArrayList<Course> courses;

    public Student(int id, String name, int age, String department) {
        super(id, name, age);
        this.department = department;
        this.courses = new ArrayList<>();
    }

    public String getDepartment() {
        return department;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Student ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Department: " + department);
    }
}