package googleBooksAPI_GET_REQUEST__JSON;


//README
//Dear Team,
//If you want that json will work on your project you will have to import from external resource the JSON JAR.
//Here is how to:
//https://stackoverflow.com/questions/8997598/importing-json-into-an-eclipse-project

public class ConstUtils {
	
	private static String BASE_URL = "https://www.googleapis.com/books/v1/volumes?q=";
	
	public static String getBaseUrl() {
		return BASE_URL;
	}
}