package com.classobjprogram;

public class studstatic {

	String name;
	int rollnumber;
	String collegename = "COEP";

	public studstatic(String name, int rollnumber) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.rollnumber = rollnumber;
		
	}

	void display() {
		System.out.println(name +" "+ collegename +" "+ rollnumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		studstatic obj = new studstatic("shraddha",100);
		studstatic obj1 = new studstatic("shraddha1", 100);
		obj1.display();
	}
}
