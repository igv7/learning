package echo;

import java.io.IOException;

public class Echo {

	public static void main(String[] args) {
		
		try {
			int a;
			while ((a = System.in.read()) != -1);{
				System.out.write(a);
			}
			
		} catch (IOException ex) {
			System.err.println("An error has occurred");
			ex.printStackTrace();
			
		}
		

	}

}