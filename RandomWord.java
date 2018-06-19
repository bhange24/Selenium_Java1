package javaprogram;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class RandomWord {

	public static void main(String[] args) {
		try {
			// create New folder
			File file = new File("C:\\Users\\admin\\Desktop\\Directory1");
			if (!file.exists()) {
				if (file.mkdir()) {
					System.out.println("Directory is created!");
				} else {
					System.out.println("Failed to create directory!");
				}
			}

			for (int i = 0; i < 10; i++) {
				String randomWord = createRandomname(3);
				// System.out.println(randomWord);
				// Path tempPath = Files.createTempDirectory(randomWord);
				// Path tempPath = Files.createDirectory(randomWord);

				// Path path = Paths.get("C:\\Users\\admin\\Desktop\\Directory1", folderName);
				Path path = Paths.get("C:\\Users\\admin\\Desktop\\Directory1");
				Path fileToCreatePath = path.resolve(randomWord + ".txt");
				Path newFilePath = Files.createFile(fileToCreatePath);
				System.out.println("New file created: " + newFilePath);
				
			}
			// Iterating list of file
			File directory = new File("C:\\Users\\admin\\Desktop\\Directory1");

			// get all the files from a directory
			FileFilter filter = new FileFilter() {
				@Override
				public boolean accept(File pathname) {
					return pathname.isFile();
				}
			};

			
			File[] fList = directory.listFiles(filter);

			for (File file2 : fList) {

				String fileName = file2.getName();
				System.out.println(fileName);
				String folderName = fileName.substring(0, 1);
				File folder = new File("C:\\Users\\admin\\Desktop\\Directory1", folderName);

				if (!folder.exists()) {
					folder.mkdir();
				}

				Path pathSource = Paths.get("C:\\Users\\admin\\Desktop\\Directory1\\" + fileName);
				Path pathTarget = Paths.get(folder.getPath() + "\\" + fileName);
				// Copying files
				Files.copy(pathSource, pathTarget, StandardCopyOption.REPLACE_EXISTING);
			}
			
			System.out.println("All files are coppied");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// string manipulation for naming of text file
	public static String createRandomname(int len) {
		String name = "";
		for (int i = 0; i < len; i++) {
			int v = 1 + (int) (Math.random() * 26);
			char c = (char) (v + (i == 0 ? 'A' : 'a') - 1);
			name += c;
		}
		return name;
	}

}
