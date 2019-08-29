package networking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLReaderMalformedURLException {

	public static void main(String[] args){
		try {
			URL yahoo = new URL("https://www.yahoo.com/");
			URLConnection yahooConnection = yahoo.openConnection();


		}
		catch(MalformedURLException e) {
			System.out.println("Bad url...");
		} catch (IOException e) {
			System.out.println("openConnection() Failed...");

		}
	}

}
