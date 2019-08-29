import java.io.IOException;

import org.json.JSONException;

public class Test {

	public static void main(String[] args) throws IOException {
		
		String name="igor";
		String json = NetworkUtils.getBooksByName(ConstUtils.getGoogleUrl(), name);
		//System.out.println(json);
		try {
			JsonUtils.convertJsonIntoNiceString(json);
		} catch (JSONException e) {
			e.printStackTrace();
		}

	}

}
