package com.constructor;

public class Employee {

	int id;
	String name;
	double sal;

	 Employee(int id, String name, double sal) {

		this.id = id;
		this.name = name;
		this.sal = sal;
	}

 Employee() {
		id = 0;
		name = "pradeep";
		sal = 10000;
	}
 

	public static void main(String[] args) {

		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e1 = new Employee(18, "Ramesh", 300000);
		e2.Employeeinfo();
		e1.Employeeinfo();
		e3.Employeeinfo();
	
	}


	void Employeeinfo() {
		System.out.println("******  EMP INFO  *********");
		System.out.println("EMPLOYEE ID : " + id);
		System.out.println("EMPLOYEE Name : " + name);
		System.out.println("EMPLOYEE sal  : " + sal);
	}
}
