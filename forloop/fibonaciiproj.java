package com.forloop;

public class fibonaciiproj {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 0;
		int b = 1;
		int c = a + b;
		for (int i = 0; i <= 10; i++) {
			c = a + b;
			a = b;
			b = c;
			System.out.println("Series is " + c);
		}

	}

}
