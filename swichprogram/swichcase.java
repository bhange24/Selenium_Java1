package com.swichprogram;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class swichcase {

	public static void main(String[] args) throws IOException {
		System.out.println("Please enter your total marks");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int mark = Integer.parseInt(reader.readLine());

		switch (mark) {
		case 40:
			System.out.println("C grade");
			break;
		case 60:
			System.out.println("B grade");
			break;
		case 70:
			System.out.println("A grade");
			break;
		case 90:
			System.out.println("A grade");
			break;
		default:
			System.out.println("Invalid case");
		}
	}

}
