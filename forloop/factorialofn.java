package com.forloop;

public class factorialofn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f = 1, n = 5;

		for (int i = 1; i <= n; i++) {
			f = f * i;
		}
		System.out.println("factorial of n=" + f);
	}
}