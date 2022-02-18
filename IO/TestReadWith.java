import java.io.FileReader;
import java.io.IOException;

/**
 * Java try-with-resources, is an exception handling mechanism that can
 * automatically close resources like a Java InputStream or a JDBC Connection
 * when you are done with them. To do so, you must open and use the resource
 * within a Java try-with-resources block.
 * 
 * @author Sunil Sahu
 *
 */
public class TestReadWith {

	public static void main(String[] args) throws IOException {

		try (FileReader in = new FileReader("f:/test.txt")) {
			int ch = in.read();
			while (ch != -1) { // -1 is end of file
				System.out.print((char) ch);
				ch = in.read();
			}
		}
	}

}
