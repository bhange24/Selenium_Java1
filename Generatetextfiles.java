package javaprogram;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Generatetextfiles {

	public static void main(String... args) throws IOException {
		
		 File file = new File("C:\\Users\\admin\\Desktop\\Directory1");
	        if (!file.exists()) {
	            if (file.mkdir()) {
	                System.out.println("Directory is created!");
	            } else {
	                System.out.println("Failed to create directory!");
	            }
	        }
		
		/*Path path = Paths.get("C:\\Users\\admin\\Desktop\\Directory1\\Directory2\\Directory3");
        //if directory exists?
        if (!Files.exists(path)) {
        	try {
            Files.createDirectories(path);
        } catch (IOException e) {
            //fail to create directory
            e.printStackTrace();
        }*/
		

	    Path path = Paths.get("C:\\Users\\admin\\Desktop\\Directory1"); 
        Path fileToCreatePath = path.resolve("test-file.txt");
        Path newFilePath = Files.createFile(fileToCreatePath);
        System.out.println("New file created: " + newFilePath);
        System.out.println("New File exits: " + Files.exists(newFilePath));
    }
	}

