package com.introduction;

class Studentstatic {

    String name;

    static String college = "ABC College";


    void displayName() {
        System.out.println("Name: " + name);
    }


    static void displayCollege() {
        System.out.println("College: " + college);
    }

    public static void main(String[] args) {

        Studentstatic s1 = new Studentstatic();
        Studentstatic s2 = new Studentstatic();
        Studentstatic s3 = new Studentstatic();
        

        s1.name = "Charan";
        s2.name = "Rahul";
        s3.name="hrishi";
    
        s1.displayName();
        s2.displayName();
        s3.displayName();

        Studentstatic.displayCollege();
    }
}