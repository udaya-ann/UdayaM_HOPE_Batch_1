package com.courseplatform.main;

import java.util.*;
import com.courseplatform.model.*;
import com.courseplatform.service.*;
import com.courseplatform.util.*;

public class MainApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EnrollmentService service = new EnrollmentService();

        System.out.println("Enter number of modules:");
        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            System.out.println("\nEnter Module Title:");
            String title = sc.next();

            System.out.println("Enter Duration:");
            int duration = sc.nextInt();

            if (!ValidationUtil.isValidDuration(duration)) {
                System.out.println("Invalid duration!");
                continue;
            }

            CourseModule module = new CourseModule(title, duration);
            service.addModule(module);
        }

        System.out.println("\nEnter number of learners:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter ID:");
            int id = sc.nextInt();

            System.out.println("Enter Name:");
            String name = sc.next();

            System.out.println("Enter Enrolled Module:");
            String course = sc.next();

            Learner learner = new Learner(id, name, course);
            service.addLearner(learner);
        }

        System.out.println("\n--- Modules ---");
        service.showModules();

        System.out.println("\n--- Learners ---");
        service.showLearners();
    }
}