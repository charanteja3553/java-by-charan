package com.logicalstatements;

public class Movie {

	String name;
	String hero;
	String heroine;
	String director;
	double budget;

	Movie(String name, String director) {
		this.name = name;
		this.director = director;
	}

	Movie(String hero, String heroine, double budget) {

	}

	Movie(Movie m) {
		this.name = m.name;
		this.budget = m.budget;
		this.director = m.director;
		this.heroine = m.heroine;
		this.hero = m.hero;
	}

	public Movie() {
		System.out.println("no arg constructor called ");

	}

	{
		System.out.println("Welcome to DVV Banner !!");

	}

	public static void main(String[] args) {

		Movie m = new Movie();
		m.director = " S S Rajamouli";
		m.hero = "Mahesh Babu";
		m.heroine = "Priyanka Chopra";
		m.name = "Varanasi";
		m.budget = 1200000000.00;
		m.movieInfo();

		Movie m1 = new Movie(m);
		m1.movieInfo();

	}

	void movieInfo() {
		System.out.println("*************");
		System.out.println("Movie Name : " + name);
		System.out.println("Hero Name : " + hero);
		System.out.println("heroine Name : " + heroine);
		System.out.println("director Name : " + director);
		System.out.println("budget Name : " + budget);
	}

}