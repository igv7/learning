package echo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EchoLines {

	public static void main(String[] args) {
		
		try {

			BufferedReader in = new BufferedReader(new FileReader("c:/jbtest/myFile.txt"));

			BufferedWriter out = new BufferedWriter(new FileWriter("c:/jbtest/copy.txt"));

			String s;

			while ((s = in.readLine()) != null) {

			out.write(s);

			out.newLine();
			
			
			
			//Very Important
		

			}
			
			out.write("this is line 3");
			out.close();
			
			} catch(IOException ex) {
				System.err.println("An error has occurred.");

				ex.printStackTrace();
			}
	}

	

}
