package javaprogram;

import java.util.ArrayList;

class Matrix {
	public static void main(String args[]) {
		try {
			ArrayList<String> array1 = new ArrayList<String>();
			String array[]= { "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q",
					"r", "s", "t", "u", "v", "w", "x", "y", "z"};
			for (int k = 0; k < array.length; k++) {
				array1.add(array[k]);
	        }
			
			String alphamatrix[][] = new String[26][26];
			int i, j;

			for (i = 0; i < array1.size(); i++) {

				for (j = 0; j < array1.size(); j++) {

					alphamatrix[i][j] = array1.get(j);
				}
				String ele = array1.get(0);
				array1.remove(0);
				array1.add(25, ele);
			}

	

			System.out.println("Elements in Matrix are : ");
			System.out.println("");
			for (i = 0; i <= 25; i++) {
				for (j = 0; j <= 25; j++) {
					System.out.print(alphamatrix[i][j] + "\t");
				}
				System.out.println();
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}