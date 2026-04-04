package com.studentmanagement.util;

public class ValidationUtil {

    public static boolean isValidId(int id) {
        return id > 0;
    }

    public static boolean isValidName(String name) {
        return name != null && !name.trim().isEmpty();
    }

    public static boolean isValidAge(int age) {
        return age > 0;
    }

    public static boolean isValidMarks(double marks) {
        return marks >= 0 && marks <= 100;
    }
}