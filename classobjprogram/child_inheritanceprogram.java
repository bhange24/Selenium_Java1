package com.classobjprogram;

public class child_inheritanceprogram extends inheritanceprogram {

	public void run() {
		System.out.println("this is child program");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		child_inheritanceprogram obj1 = new child_inheritanceprogram();
		System.out.println(obj1.name);
		obj1.display();
		System.out.println("Result =" + " " + obj1.displayresult(80)+ "%");
	}

}