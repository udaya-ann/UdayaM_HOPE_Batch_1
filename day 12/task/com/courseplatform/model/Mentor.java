package com.courseplatform.model;

public class Mentor extends Person {
    private String expertise;

    public Mentor(int id, String name, String expertise) {
        super(id, name);
        this.expertise = expertise;
    }

    public String getExpertise() {
        return expertise;
    }
}