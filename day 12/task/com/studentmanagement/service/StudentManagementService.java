package com.studentmanagement.service;

import java.util.ArrayList;
import com.studentmanagement.model.Student;
import com.studentmanagement.model.Teacher;
import com.studentmanagement.model.Course;
import com.studentmanagement.model.ReportCard;

public class StudentManagementService {
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Teacher> teachers = new ArrayList<>();
    private ArrayList<Course> courses = new ArrayList<>();
    private ArrayList<ReportCard> reportCards = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void enrollStudent(Student student, Course course) {
        course.addStudent(student);
    }

    public void addReportCard(ReportCard reportCard) {
        reportCards.add(reportCard);
    }

    public void displayAllStudents() {
        for (Student s : students) {
            s.displayInfo();
            System.out.println();
        }
    }

    public void displayAllTeachers() {
        for (Teacher t : teachers) {
            t.displayInfo();
            System.out.println();
        }
    }

    public void displayAllCourses() {
        for (Course c : courses) {
            c.displayCourseInfo();
            System.out.println();
        }
    }

    public void displayAllReportCards() {
        for (ReportCard r : reportCards) {
            r.displayReport();
            System.out.println();
        }
    }
}