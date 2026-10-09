package com.constructor;

public class StudentDemo {
    public static void main(String[] args) {
        Student.showRules();

        Student s1 = new Student(101, "Charan", 95, 88, 92);
        Student s2 = new Student(102, "Rahul", 80, 30, 85);
        Student s3 = new Student(103, "Priya");

        s1.displayResult();
        System.out.println("------------");
        s2.displayResult();
        System.out.println("------------");
        s3.displayResult();
    }
}