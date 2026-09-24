package com.introduction;

public class Cricketer {

	static int countryid =91;
	static String countryName = "india";
	
	String playerName;
	int Playerid;
	
	public static void main(String[] args) {
		
	 Cricketer c1= new Cricketer();
	 
	 c1.playerName="virat";
	 c1.Playerid=18;
	 
    System.out.println("PlayerName :"+c1.playerName);
    System.out.println("playerid :"+c1.Playerid);
    System.out.println("COUNTRYID : "+countryid);
    System.out.println("COUNTRYNAME :"+countryName);
    
    
    Cricketer c2= new Cricketer();
	 
	 c2.playerName="dhoni";
	 c2.Playerid=7;
	 
   System.out.println("PlayerName :"+c2.playerName);
   System.out.println("playerid :"+c2.Playerid);
	}

}
