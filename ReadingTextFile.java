package javaprogram;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingTextFile {

	public static void main(String[] args) {

		ReadingTextFile rtf = new ReadingTextFile();
		File file = new File("C:\\Users\\admin\\Desktop\\numbees.txt");
		rtf.countAdjletter(1, file);
	}

	public void countAdjletter(int num, File file1) {
		int count = 0;
		try {

			Scanner sc = new Scanner(file1);

	      
			while (sc.hasNextInt()) {
				int nextnum = sc.nextInt();
				if (nextnum == num)

					count++;
			}

			System.out.println(num + "Repeted" + count + "times");

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
