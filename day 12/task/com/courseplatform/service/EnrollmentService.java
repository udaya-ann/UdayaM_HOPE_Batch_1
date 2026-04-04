package com.courseplatform.service;

import java.util.*;
import com.courseplatform.model.*;

public class EnrollmentService {
    private ArrayList<Learner> learners = new ArrayList<>();
    private ArrayList<CourseModule> modules = new ArrayList<>();

    public void addLearner(Learner l) {
        learners.add(l);
    }

    public void addModule(CourseModule m) {
        modules.add(m);
    }

    public void showLearners() {
        for (Learner l : learners) {
            System.out.println(l.getName() + " -> " + l.getEnrolledCourse());
        }
    }

    public void showModules() {
        for (CourseModule m : modules) {
            m.display();
        }
    }
}