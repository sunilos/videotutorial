import java.io.FileReader;

/**
 * Read data from a text file character by character using BufferedReader class
 * 
 * @author Sunil Sahu
 *
 */
public class TestReadFile {

	public static void main(String[] args) throws Exception {

		// open a file
		FileReader in = new FileReader("f:/test.txt");

		// Reads a character
		int ch = in.read();
		while (ch != -1) { // -1 is end of file
			System.out.print((char) ch);
			ch = in.read();
		}
		in.close();
	}

}
