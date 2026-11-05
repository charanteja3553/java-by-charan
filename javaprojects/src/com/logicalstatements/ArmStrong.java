package com.logicalstatements;

import java.util.Scanner;

public class ArmStrong{
	
	static boolean isArmStrongNum (int n) {
		boolean status =false;
		int r=0;
		int sumP=0;
		int temp=n;
		
		String str =Integer.toString(n);
		int digitcount=str.length();
		
		while (n>0) {
			r=n%10;
			n=n/10;
	sumP=sumP+r*r*r;
	
//	sump=(int)(sump)+Math.pow(r, digitcount));
		}
		
		if(temp==sumP) {
			status=true;
		}
		return status;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	//	System.out.println(Math.pow(8, 2));
		System.out.println("Enter the number : ");
		int n=sc.nextInt();
		
		boolean flag =isArmStrongNum(n);
		
		if (flag) {
			System.out.println("Armstrong");
		}else {
			System.out.println("no");
		}
		
	}

}
