package com.introduction;

public class Employee {
	
	int empid;
	String empName;
	int empSalary;
	
	void  Method1() {
		
		System.out.println("Employee id : "+empid);
		System.out.println(" ");
		System.out.println("Employee Name: "+empName);
		System.out.println(" ");
		System.out.println("Employee Salary: "+empSalary);
		System.out.println("****************************************");
	}

	public static void main(String[] args) {

		 Employee E =new Employee();
		 Employee E1=new Employee();
		 Employee E2=new Employee();
		 Employee E3=new Employee();
		 
		 
		 E.empid=1;
		 E.empName="Govid";
		 E.empSalary=50000;
		 
		 E1.empid=3;
		 E1.empName="Rahul";
		 E1.empSalary=30000;
		 
		 E2.empid=5;
		 E2.empName="Madhu";
		 E2.empSalary=25000;
		 
		 E3.empid=9;
		 E3.empName="Charan";
		 E3.empSalary=75000;
		 
		E3.Method1();
		E2.Method1();
		E1.Method1();
		E.Method1();
	
	}

}
