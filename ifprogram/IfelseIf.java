package com.ifprogram;

public class IfelseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mark = 90;
		if (mark < 40) {
			System.out.println("Failed");
		} else if (mark > 50 && mark <= 60) {
			System.out.println("A");
		} else if (mark > 60 && mark <= 70) {
			System.out.println("A+");
		} else {
			System.out.println("Result not found");
		}
	}
}
