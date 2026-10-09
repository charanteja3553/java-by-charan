package com.constructor;

class Student {
    int id;
    String name;
    int javaMarks;
    int sqlMarks;
    int pythonMarks;

    // Default constructor
    Student() {
        this(0, "Not Assigned", 0, 0, 0);
    }

    // Constructor with basic details
    Student(int id, String name) {
        this(id, name, 0, 0, 0);
    }

    // Fully parameterized constructor
    Student(int id, String name, int javaMarks,
            int sqlMarks, int pythonMarks) {
        this.id = id;
        this.name = name;
        this.javaMarks = javaMarks;
        this.sqlMarks = sqlMarks;
        this.pythonMarks = pythonMarks;
    }

    int calculateTotal() {
        return javaMarks + sqlMarks + pythonMarks;
    }

    double calculateAverage() {
        return calculateTotal() / 3.0;
    }

    String getGrade() {
        if (javaMarks < 35 || sqlMarks < 35 || pythonMarks < 35)
            return "Fail";

        double avg = calculateAverage();

        if (avg >= 90) return "A+";
        else if (avg >= 75) return "A";
        else if (avg >= 60) return "B";
        else return "C";
    }

    void displayResult() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Total: " + calculateTotal());
        System.out.println("Average: " + calculateAverage());
        System.out.println("Grade: " + getGrade());
    }

    static void showRules() {
        System.out.println("Each subject requires 35 marks to pass.");
    }
}

