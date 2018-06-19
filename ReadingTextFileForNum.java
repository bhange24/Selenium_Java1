package javaprogram;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadingTextFileForNum {

	public static void main(String[] args) {

		try {
			// TODO Auto-generated method stub
			// Providing location to FileReader instance
			FileReader fr = new FileReader("C:\\Users\\admin\\Desktop\\numbees.txt");
			// Creating array for storing number of .text file
			ArrayList<Character> elements = new ArrayList<>();
			int i;
			while ((i = fr.read()) != -1) {
				// while(i=fr.read()) {
				char ch = (char) i;
				System.out.print(ch);
				elements.add(ch);
			}
			char previousValue = 'a';
			
			int[] Array1 = new int[10];
			for (int j = 0; j < elements.size(); j++) {
				char value = elements.get(j);
				int a=Character.getNumericValue(value);  
				if (previousValue == value) {
					Array1[a]+=1;
				}
				previousValue = value;
				// System.out.println("\n" + "Element: " + value);
			}
			for (int k = 0; k < Array1.length; k++) {
				System.out.print("\n Adjucent count of " + k + " is "+ Array1[k] );
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
