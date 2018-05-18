package com.classobjprogram;

public class staticbikedetails {

	static String bikename;
	static int ingine;
	static String bikecategory = "Twowleeler";

	public staticbikedetails(String bikename, int ingine) {
		// TODO Auto-generated constructor stub
		staticbikedetails.bikename = bikename;
		staticbikedetails.ingine = ingine;
		System.out.println(bikename + "\n" + bikecategory + "\n" + ingine);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		staticbikedetails obj1 =new staticbikedetails("Facino", 110);
		
		//staticbikedetails("CBZ", 150);
		
	}
}
