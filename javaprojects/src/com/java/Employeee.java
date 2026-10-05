package com.java;

class Employeee {
	    int empId;
	    String empName;
	    double salary;

	    Employeee(int empId, String empName, double salary) {
	        this.empId = empId;
	        this.empName = empName;
	        this.salary = salary;
	    }


	    Employeee(Employeee e) {
	        this.empId = e.empId;
	        this.empName = e.empName;
	        this.salary = e.salary;
	    }

	    void display() {
	        System.out.println("ID     : " + empId);
	        System.out.println("Name   : " + empName);
	        System.out.println("Salary : " + salary);
	    }

	
	    void incrementSalary(double amount) {
	        salary += amount;
	    }

	    public static void main(String[] args) {
	
	        Employeee emp1 = new Employeee(101, "Krishna", 50000);

	        Employeee emp2 = new Employeee(emp1);

	        emp2.incrementSalary(10000);
	        emp2.empName = "Ravi";

	        System.out.println("Employeee 1");
	        emp1.display();

	        System.out.println();

	        System.out.println("Employeee 2");
	        emp2.display();
	    }
	}
