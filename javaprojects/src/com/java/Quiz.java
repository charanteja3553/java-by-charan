package com.java;

public class Quiz {

    String subject;
    int totalQuestions;
    int timeLimit;

    Quiz() {
        this("Java");
        System.out.println("No-arg Constructor");
    }

    Quiz(String subject) {
        this(subject, 20);
        System.out.println("Constructor with Subject");
    }

    Quiz(String subject, int totalQuestions) {
        this(subject, totalQuestions, 30);
        System.out.println("Constructor with Subject and Total Questions");
    }

    Quiz(String subject, int totalQuestions, int timeLimit) {
        this.subject = subject;
        this.totalQuestions = totalQuestions;
        this.timeLimit = timeLimit;
        System.out.println("Constructor with Subject, Total Questions and Time Limit");
    }

    public static void main(String[] args) {

        Quiz q1 = new Quiz();

    }
}