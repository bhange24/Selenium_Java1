package com.classobjprogram;

public class cclass extends bclass {
	public void run() {
		System.out.println("cclass funtion");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cclass obj1 = new cclass();
		obj1.run();
		bclass obj2 = new bclass();
		obj2.run();
		aclass obj3 = new bclass();
		obj3.run();


	}

}
