package com.classobjprogram;

public class bikedetails {

	static String bikename;
	static int ingine;
	static String bikecategory = "Twowleeler";

	public bikedetails(String bikename, int ingine) {
		// TODO Auto-generated constructor stub
		this.bikename = bikename;
		this.ingine = ingine;
		System.out.println(bikename + " " + bikecategory + " " + ingine);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		bikedetails obj = new bikedetails("Facino", 110);
		bikedetails obj1 = new bikedetails("CBZ", 150);

	}

}
