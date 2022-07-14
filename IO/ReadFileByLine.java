import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Read data from a text file line by line using BufferedReader class
 * 
 * @author Sunil Sahu
 *
 */
public class ReadFileByLine {

	public static void main(String[] args) throws Exception {

		// Open file
		FileReader file = new FileReader("f:/test.txt");

		// Open buffered stream from the file
		BufferedReader in = new BufferedReader(file);

		String line = in.readLine();
		while (line != null) {
			System.out.println(line);
			line = in.readLine();
		}

		// close streams
		in.close();
	}

}
