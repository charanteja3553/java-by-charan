package com.introduction;

public class Institute {

	void method1() {
		System.out.println("EMPLOYEE DETAILS :" + " 'NAME' " + EmployeeName + " 'ID' " + EmployeetId + " 'DESIGNATION' "
				+ EmployeeDesignation);
		System.out.println(" 'TRAINERNAME' : " + TrainerName1 + "  " + " 'TRAINERNAME' : " + TrainerName2);
	}

	static {
		System.out.println("Static block ");
	}

	{
		System.out.println("instance blcok");
	}

	String EmployeeName;
	int EmployeetId;
	String EmployeeDesignation;
	static String TrainerName1 = "Vishwanath sir";
	static String TrainerName2 = "Srikanth sir";

	static void method2() {
		System.out.println("Main method started");
	}

	public static void main(String[] args) {

		Institute i1 = new Institute();
		System.out.println("creation object");
		i1.EmployeeName = "Bharath";
		i1.EmployeetId = 35;
		i1.EmployeeDesignation = "lab trainer";
		i1.method1();

		Institute i2 = new Institute();
		i2.EmployeeName = "jeevan";
		i2.EmployeetId = 25;
		i2.EmployeeDesignation = "lab trainer";

		Institute i3 = new Institute();
		i3.EmployeeName = "pramela";
		i3.EmployeetId = 15;
		i3.EmployeeDesignation = "lab cordinator";
		i3.method1();
		method2();

		Institute i4 = new Institute();
		i4.EmployeeName = "janvi";
		i4.EmployeetId = 5;
		i4.EmployeeDesignation = "lab cordinator";

		Institute i5 = new Institute();
		i5.EmployeeName = " kishor";
		i5.EmployeetId = 45;
		i5.EmployeeDesignation = "lab trainer";

		System.out.println(" 'TRAINERNAME' : " + TrainerName1 + "  " + " 'TRAINERNAME' : " + TrainerName2);
		System.out.println("EMPLOYEE DETAILS :" + " 'NAME' " + i1.EmployeeName + " 'ID' " + i1.EmployeetId
				+ " 'DESIGNATION' " + i1.EmployeeDesignation);
		System.out.println("EMPLOYEE DETAILS :" + " 'NAME' " + i2.EmployeeName + " 'ID' " + i2.EmployeetId
				+ " 'DESIGNATION' " + i2.EmployeeDesignation);
		System.out.println("EMPLOYEE DETAILS :" + " 'NAME' " + i3.EmployeeName + " 'ID' " + i3.EmployeetId
				+ " 'DESIGNATION' " + i3.EmployeeDesignation);
		System.out.println("EMPLOYEE DETAILS :" + " 'NAME' " + i4.EmployeeName + " 'ID' " + i4.EmployeetId
				+ " 'DESIGNATION' " + i4.EmployeeDesignation);
		System.out.println("EMPLOYEE DETAILS :" + " 'NAME' " + i5.EmployeeName + " 'ID' " + i5.EmployeetId
				+ " 'DESIGNATION' " + i5.EmployeeDesignation);

	}

}
