package com.forloop;

import java.util.Scanner;

public class Factuserinputs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f = 1;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number = ");
		int n = scan.nextInt();
		
		for (int i = 1; i <= n; i++) {
			f = f * i;
		}
		System.out.println("factorial of "+ n+ " = " + f);

	}

}
