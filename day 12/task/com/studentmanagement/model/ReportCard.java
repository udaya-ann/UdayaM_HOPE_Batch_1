package com.studentmanagement.model;

public class ReportCard {
    private Student student;
    private Course course;
    private double marks;
    private char grade;

    public ReportCard(Student student, Course course, double marks) {
        this.student = student;
        this.course = course;
        this.marks = marks;
        this.grade = calculateGrade();
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public double getMarks() {
        return marks;
    }

    public char getGrade() {
        return grade;
    }

    public char calculateGrade() {
        if (marks >= 90) return 'A';
        else if (marks >= 75) return 'B';
        else if (marks >= 60) return 'C';
        else if (marks >= 40) return 'D';
        else return 'F';
    }

    public void displayReport() {
        System.out.println("Student: " + student.getName());
        System.out.println("Course: " + course.getCourseName());
        System.out.println("Teacher: " + course.getTeacher().getName());
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}