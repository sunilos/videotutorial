import java.io.FileReader;

/**
 * Read data character by character from a text file using FileReader class
 * 
 * @author Sunil Sahu
 *
 */
public class TestReadFile {

	public static void main(String[] args) throws Exception {

		// open a file
		FileReader in = new FileReader("f:/test.txt");

		// Read a character
		int ch = in.read();

		// Read character by character until the end of the file
		while (ch != -1) { // -1 is end of file
			System.out.print((char) ch);
			ch = in.read();
		}

		// close the stream
		in.close();
	}

}
