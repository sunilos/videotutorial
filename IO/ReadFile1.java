
import java.io.FileReader;
import java.io.IOException;

/**
 * Read from a file using try-with-resources block
 * 
 * @author Sunil Sahu
 *
 */
public class ReadFile1 {
	public static void main(String[] args) throws IOException {
		try (FileReader in = new FileReader("f:/test.txt");) {
			int ch = in.read(); // read ASCII code
			char chr;
			// read character by character
			while (ch != -1) { // -1 is end of file
				chr = (char) ch;
				System.out.print(chr);
				ch = in.read();
			}
		}
	}

}
