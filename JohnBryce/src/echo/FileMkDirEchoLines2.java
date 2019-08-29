package echo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileMkDirEchoLines2 {

	public static void main(String[] args) {
		
		try {
			String folderName = "C:/jbtest2/";
			String fileName = folderName + "myFile2.txt";
			
			File fileFolder = new File(folderName);
			fileFolder.mkdir();
			
			boolean exists = fileFolder.exists();
			if (!exists) {
				System.out.println("storeText folder doesn't exist");
			}
			System.out.println("storeText folderName - " + folderName);
			System.out.println("storeText fileName - " + fileName);
			
			File file = new File(fileName);
			BufferedWriter out = new BufferedWriter(new FileWriter(file));
			out.write("Igor");
			out.newLine();
			out.write("Gamazov");
			out.newLine();
			out.write("is a nice guy.. I hope..");
			out.flush();
			out.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		
		
		try {
			BufferedReader in = new BufferedReader(new FileReader("C:/jbtest2/myFile2.txt"));
			BufferedWriter out = new BufferedWriter(new FileWriter("C:/jbtest2/copy2.txt"));
			String string;
			
			while ((string = in.readLine()) != null) {
				out.write(string);
				out.newLine();
			}
			out.write("this is line 4");
			out.close();
			
		} catch (Exception e) {
			System.err.println("An error has occurred");
			e.printStackTrace();
		}

	}

}
