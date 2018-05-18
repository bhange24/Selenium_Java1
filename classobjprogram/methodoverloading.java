package com.classobjprogram;

public class methodoverloading {
	static int add(int a, int b) {
		return (a + b);
	}

	int add(int a, int b, int c) {
		return (a + b + c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodoverloading obj = new methodoverloading();
		System.out.println(methodoverloading.add(23, 34));
		System.out.println(obj.add(23, 34, 20));

	}

}
