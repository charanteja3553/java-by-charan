package com.logicalstatements;

public class Employe {

	public static void main(String[] args) {
		
		int employeeid=75;
		int employeeage=27;
		
		double employeesalary=85000;
		char employeegrade='B';
		int yearsofexp=3;
		boolean employeeactive=true;
		int Numberofleaves=2;
		long employeenumber=73330800033330L;
		
		System.out.println("Employee ID : " + employeeid);
		System.out.println("Employee age :"+employeeage);
		System.out.println("Employee salary : "+ employeesalary);
		System.out.println("Employee grade : "+ employeegrade) ;
		System.out.println("Employee Years of experience : "+yearsofexp);
		System.out.println("Employee is active :"+employeeactive);
		System.out.println("Number of leaves in a month :" +Numberofleaves);
		System.out.println("Employee phone number : "+employeenumber);
		System.out.println("**********************");

	}



static {
Employe e1 = new Employe();

//com.javaintro. Employee@1dbd16a6

System.out.println(e1);//com.javaintro. Employee@Hexa-DecimalValue --> Address of the ob

int objValue = 0X1dbd16a6;



System.out.println(objValue); // hashCode --> 498931366

System.out.println(e1.hashCode());// 498931366


Employe e2 = new Employe();

System.out.println(e2);//com[javaintro. Employee@7ad041f3


e1 = null;
System.out.println("***********************");
}
}
