package com.classobjprogram;

public class studentdetails {

	String name;
	int rollnumber;

	public studentdetails(String name1, int rollnumber1) {
		// TODO Auto-generated constructor stub
		name = name1;
		rollnumber = rollnumber1;
		System.out.println(name + " " + rollnumber);

	}

	void display() {
		System.out.println(name + " " + rollnumber);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		studentdetails obj1 = new studentdetails("shraddha", 100);

		obj1.display();
	}

}
