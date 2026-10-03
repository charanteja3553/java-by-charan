package com.introduction;

public class Students {

    static String collegeName = "V Cube";

    String studentName;
    int studentAge;

    void display() {
        System.out.println("COLLEGE NAME : " + collegeName);
        System.out.println("STUDENT NAME : " + studentName);
        System.out.println("STUDENT AGE  : " + studentAge);
    }

    public static void main(String[] args) {

        Students s1 = new Students();
        s1.studentName = "Charan";
        s1.studentAge = 21;

        Students s2 = new Students();
        s2.studentName = "Kiran";
        s2.studentAge = 23;

        Students s3 = new Students();
        s3.studentName = "Rahul";
        s3.studentAge = 20;

        s1.display();
        System.out.println();

        s2.display();
        System.out.println();

        s3.display();
 
    }
}