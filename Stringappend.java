package javaprogram;

import java.util.ArrayList;
import java.util.Scanner;

public class Stringappend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner inputname = new Scanner(System.in);
		System.out.println("Enter Input String");
		String string1 = inputname.next();
		System.out.println(string1.length());

		// getting the 1st String into array

		ArrayList<Character> inputchar = new ArrayList<>();
		for (int j = 0; j < string1.length(); j++) {
			char ch = string1.charAt(j);
			inputchar.add(ch);
		}
		/*for (int j = 0; j < inputchar.size(); j++) {
			System.out.println(inputchar.get(j));
		}
*/
		System.out.println("Enter a String to  Match");
		String string2 = inputname.next();
		System.out.println(string2.length());

		// getting the 2nd String into array

		ArrayList<Character> Matchchar = new ArrayList<>();
		for (int j = 0; j < string2.length(); j++) {
			char ch = string2.charAt(j);
			Matchchar.add(ch);
		}
		/*for (int j = 0; j < Matchchar.size(); j++) {
			System.out.println(Matchchar.get(j));
		}
		 */
		if (inputchar.size() == Matchchar.size()) {
			System.out.println("Both String Length is same");
		} else if (inputchar.size() < Matchchar.size()) {
			int Matchcharsize = Matchchar.size();
			int inputcharsize = inputchar.size();
			int diff = Matchcharsize - inputcharsize;
			System.out.println(diff);
			for (int k = 0; k < diff; k++) {

				char ch = string1.charAt(k);
				inputchar.add(ch);

			}
			// Printing 1st Array again
			for (int x = 0; x < inputchar.size(); x++) {
				System.out.println(inputchar.get(x));
			}

		} else {
			System.out.println("Input String Length is Greater");
		}
	}

}
