
import java.io.IOException;

public class Test {

	public static void main(String[] args) throws IOException {
		//write to file
		
		String path = "C:\\moshe\\myFile.txt";
		FileUtils.writeToFile(path, "Hello There");
		FileUtils.writeToFile(path, "Hi There");
		FileUtils.writeToFile(path, "Good morning");


	}

}
