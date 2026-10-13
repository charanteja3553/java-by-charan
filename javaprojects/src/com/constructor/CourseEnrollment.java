package com.constructor;

class CourseEnrollment {

    int studentId;
    String studentName;
    String courseName;
    double fee;

    CourseEnrollment(int id, String name,
                     String course, double fee) {

        this.studentId = id;
        this.studentName = name;
        this.courseName = course;
        this.fee = fee;
    }

    // Copy constructor
    CourseEnrollment(CourseEnrollment other) {
        this(other.studentId, other.studentName,
             other.courseName, other.fee);
    }

    void applyDiscount(double percentage) {
        if (percentage >= 0 && percentage <= 100) {
            fee -= fee * percentage / 100;
        }
    }

    void display() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Student: " + studentName);
        System.out.println("Course: " + courseName);
        System.out.println("Fee: " + fee);
    }

    public static void main(String[] args) {

        CourseEnrollment original =
                new CourseEnrollment(
                        101, "Charan", "Java Full Stack", 25000);

        CourseEnrollment copy =
                new CourseEnrollment(original);

        copy.applyDiscount(20);

        System.out.println("Original Enrollment:");
        original.display();

        System.out.println("\nDiscounted Enrollment:");
        copy.display();
    }
}