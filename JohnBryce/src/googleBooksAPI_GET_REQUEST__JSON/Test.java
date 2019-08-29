package googleBooksAPI_GET_REQUEST__JSON;

import java.io.IOException;

import org.json.JSONException;

public class Test {

	public static void main(String[] args) throws IOException, JSONException {
		
		// TODO Auto-generated method stub
		 String jsonString = NetworkUtils.getBooksByName(ConstUtils.getBaseUrl(), "kobi");
		 //System.out.println(jsonString);
		 JsonParserUtils.convertJsonIntoNiceString(jsonString);

	}

}
