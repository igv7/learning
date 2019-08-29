
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.net.HttpURLConnection;
	import java.net.URL;

import javax.xml.transform.Templates;

import org.json.JSONArray;
	import org.json.JSONException;
	import org.json.JSONObject;
	import org.json.JSONString;

	public class JsonUtils {
		public static void convertJsonIntoNiceString(String jsonString) throws IOException, JSONException {

		 System.out.println("*******************************");
		 JSONObject myObject = new JSONObject(jsonString);
		 String kind  = myObject.getString("kind");
		 System.out.println("  1 - Kind = "+kind);
		 long totalItems = myObject.getLong("totalItems");
		 System.out.println("  2 - totalItems = "+totalItems);
		 JSONArray tenItems = myObject.getJSONArray("items");
		 System.out.println("  3 - items = "+tenItems);
		 System.out.println("*******************************");
		 System.out.println("Now, let's try to run on the array with loop...");
		 for(int i=0;i<tenItems.length();i++) {
			 System.out.println("Book #"+i);
			 JSONObject tmp = tenItems.getJSONObject(i);
			 JSONObject volumeInfo = tmp.getJSONObject("volumeInfo");
			 String title = volumeInfo.getString("title");
			 String publisher="";
			 String etag = tmp.getString("etag");
			 System.out.println("etag "+etag);
			 try { 
				 //Why?
				 publisher = volumeInfo.getString("publisher");
			 }
			 
			 catch (Exception e) {
				e.getMessage();
			}
			  try { 
				 JSONArray authors = volumeInfo.getJSONArray("authors");
				 String tmpAuthor="";
				 for(int j=0;j<authors.length();j++) {
					
						 tmpAuthor = authors.getString(j).toString();
						 System.out.println("Author #"+j+" "+tmpAuthor);
					 			 
					 
				 }
			  }
			  catch (Exception e) {
				e.getCause();
			}
			  JSONObject saleInfo = tmp.getJSONObject("saleInfo");
			  String country = saleInfo.getString("country");
			  System.out.println("country: "+country);
			  boolean isEbook = saleInfo.getBoolean("isEbook");
			  if (isEbook) {
				System.out.println("isEbook: true");
			}
			  else {
				  System.out.println("isEbook: false");
			  }
			 
		 }
		 System.out.println("*******************************");
		 
		 
		}

	

}
