package com.courseplatform.model;

public class Learner extends Person {
    private String enrolledCourse;

    public Learner(int id, String name, String enrolledCourse) {
        super(id, name);
        this.enrolledCourse = enrolledCourse;
    }

    public String getEnrolledCourse() {
        return enrolledCourse;
    }
}