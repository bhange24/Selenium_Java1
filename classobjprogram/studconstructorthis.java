package com.classobjprogram;

public class studconstructorthis {

	String name;
	int rollnumber;

	public studconstructorthis(String name, int rollnumber) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.rollnumber = rollnumber;
		System.out.println(name + " " + rollnumber);

	}

	void display() {
		System.out.println(name + " " + rollnumber);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		studconstructorthis obj2 = new studconstructorthis("shraddha", 100);

		obj2.display();
	}

}
