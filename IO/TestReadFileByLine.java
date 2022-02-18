import java.io.BufferedReader;
import java.io.FileReader;

/**
 * Read data from a text file line by line using BufferedReader class
 * 
 * @author Sunil Sahu
 *
 */
public class TestReadFileByLine {

	public static void main(String[] args) throws Exception {

		FileReader file = new FileReader("f:/test.txt");
		BufferedReader in = new BufferedReader(file);

		String line = in.readLine();
		while (line != null) {
			System.out.println(line);
			line = in.readLine();
		}
		in.close();
	}

}
