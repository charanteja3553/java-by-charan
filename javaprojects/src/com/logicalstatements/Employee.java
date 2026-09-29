package com.logicalstatements;

public class Employee {

		    int empId;
		    String empName;
		    double salary;

	
		    Employee(int empId, String empName, double salary) {
		        this.empId = empId;
		        this.empName = empName;
		        this.salary = salary;
		    }

	
		    Employee(Employee e) {
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
		        salary = salary + amount;
		    }

		    public static void main(String[] args) {

		        Employee emp1 = new Employee(101, "Krishna", 50000);

		        Employee emp2 = new Employee(emp1);

		        emp2.incrementSalary(10000);
		        emp2.empName = "Ravi";

		        System.out.println("Employee 1");
		        emp1.display();

		        System.out.println();

		        System.out.println("Employee 2");
		        emp2.display();
		    }

}
