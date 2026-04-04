package com.courseplatform.model;

public class CourseModule {
    private String title;
    private int duration;

    public CourseModule(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public void display() {
        System.out.println("Module: " + title + " Duration: " + duration + " hrs");
    }
}