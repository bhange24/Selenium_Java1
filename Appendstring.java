package javaprogram;

import java.util.Scanner;

public class Appendstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inputname = new Scanner(System.in);
		System.out.println("Enter Input String");
		String string1 = inputname.next();
		System.out.println("Enter a String to  Match");
		String string2 = inputname.next();
		

		if (string1.length() < string2.length()) {
		
			int diff = string2.length() - string1.length();
			System.out.println(diff);
			for (int k = 0; k < diff; k++) {
				char ch = string1.charAt(k);
				string1= string1 + ch;
				
			}

		}
		System.out.println(string1);

	}

}
