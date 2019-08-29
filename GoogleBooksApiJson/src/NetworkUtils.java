import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class NetworkUtils {
	
 public static String getBooksByName(String url,String name) throws IOException {
				URL urlForGetRequest = new URL(url+name);
			    String readLine = null;
			    HttpURLConnection conection = (HttpURLConnection) urlForGetRequest.openConnection();
			    conection.setRequestMethod("GET");
			    int responseCode = conection.getResponseCode();
			    if (responseCode == HttpURLConnection.HTTP_OK) {
			        BufferedReader in = new BufferedReader(new InputStreamReader(conection.getInputStream()));
			        StringBuffer response = new StringBuffer();
			        while ((readLine = in .readLine()) != null) {
			            response.append(readLine);
			        } in .close();
			        // print result
			        return response.toString();
			        //GetAndPost.POSTRequest(response.toString());
			    } else {
			        System.out.println("GET NOT WORKED");
			    }
				return readLine;
	}

}
