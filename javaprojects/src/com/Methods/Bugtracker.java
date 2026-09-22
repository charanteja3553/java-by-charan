package com.Methods;


class Bugtracker {

    int bugId;
    String applicationName, bugTitle, severity, priority, status, assignedDeveloper;

    int getBugId() {
        return bugId;
    }

    String getApplicationName() {
        return applicationName;
    }

    String getBugTitle() {
        return bugTitle;
    }

    String getSeverity() {
        return severity;
    }

    String getPriority() {
        return priority;
    }

    String getStatus() {
        return status;
    }

    String getAssignedDeveloper() {
        return assignedDeveloper;
    }

    void assignToDeveloper(int id, String developerName) {
        if (bugId == id) {
            assignedDeveloper = developerName;
            updateStatus("In Development");
        }
    }

    void updateStatus(String newStatus) {
        status = newStatus;
    }

    void displayBugSummary() {
        System.out.println("Bug ID: " + getBugId());
        System.out.println("Application Name: " + getApplicationName());
        System.out.println("Bug Title: " + getBugTitle());
        System.out.println("Severity: " + getSeverity());
        System.out.println("Priority: " + getPriority());
        System.out.println("Status: " + getStatus());
        System.out.println("Assigned Developer: " + getAssignedDeveloper());
    }

    public static void main(String[] args) {

        Bugtracker b1 = new Bugtracker();

        b1.bugId = 101;
        b1.applicationName = "Banking App";
        b1.bugTitle = "Login button not working";
        b1.severity = "High";
        b1.priority = "High";
        b1.status = "Open";
        b1.assignedDeveloper = "Not Assigned";

        b1.assignToDeveloper(101, "Rahul");

        b1.displayBugSummary();
    }
}