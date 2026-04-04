package com.studentmanagement.main;

import com.studentmanagement.model.Student;
import com.studentmanagement.model.Teacher;
import com.studentmanagement.model.Course;
import com.studentmanagement.model.ReportCard;
import com.studentmanagement.service.StudentManagementService;

public class MainApp {
    public static void main(String[] args) {
        StudentManagementService sms = new StudentManagementService();

        Teacher t1 = new Teacher(201, "Mr. Kumar", 40, "Java");
        Teacher t2 = new Teacher(202, "Ms. Priya", 35, "DBMS");

        Student s1 = new Student(101, "Arun", 20, "Computer Science");
        Student s2 = new Student(102, "Meena", 21, "IT");

        Course c1 = new Course("C101", "Object Oriented Programming", t1);
        Course c2 = new Course("C102", "Database Management System", t2);

        sms.addTeacher(t1);
        sms.addTeacher(t2);

        sms.addStudent(s1);
        sms.addStudent(s2);

        sms.addCourse(c1);
        sms.addCourse(c2);

        sms.enrollStudent(s1, c1);
        sms.enrollStudent(s2, c1);
        sms.enrollStudent(s2, c2);

        ReportCard r1 = new ReportCard(s1, c1, 88);
        ReportCard r2 = new ReportCard(s2, c1, 95);
        ReportCard r3 = new ReportCard(s2, c2, 76);

        sms.addReportCard(r1);
        sms.addReportCard(r2);
        sms.addReportCard(r3);

        System.out.println("===== STUDENTS =====");
        sms.displayAllStudents();

        System.out.println("===== TEACHERS =====");
        sms.displayAllTeachers();

        System.out.println("===== COURSES =====");
        sms.displayAllCourses();

        System.out.println("===== REPORT CARDS =====");
        sms.displayAllReportCards();
    }
}