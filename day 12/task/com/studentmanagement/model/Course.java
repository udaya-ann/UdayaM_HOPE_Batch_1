package com.studentmanagement.model;

import java.util.ArrayList;

public class Course {
    private String courseId;
    private String courseName;
    private Teacher teacher;
    private ArrayList<Student> students;

    public Course(String courseId, String courseName, Teacher teacher) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.teacher = teacher;
        this.students = new ArrayList<>();

        if (teacher != null) {
            teacher.addCourse(this);
        }
    }

    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            student.addCourse(this);
        }
    }

    public void displayCourseInfo() {
        System.out.println("Course ID: " + courseId);
        System.out.println("Course Name: " + courseName);
        System.out.println("Teacher: " + teacher.getName());
    }
}