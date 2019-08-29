
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileUtils {
	public static void writeToFile(String path,String value) throws IOException {
		File file = new File(path);
		FileWriter fileWriter = new FileWriter(file,true);
		BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
		
		bufferedWriter.write(value);
		bufferedWriter.newLine();
		bufferedWriter.close();
		
		
	}
}
