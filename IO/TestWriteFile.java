import java.io.FileWriter;

/**
 * Writes data character by character to a file
 * 
 * @author Sunil Sahu
 *
 */
public class TestWriteFile {

	public static void main(String[] args) throws Exception {

		// Open file
		FileWriter out = new FileWriter("f:/newtest.txt");
		out.write('A');
		out.write('\n'); // new line character
		out.write("This is line one");
		out.write("This is line two");
		
		// Close file
		out.close();
		System.out.println("See f:/newtest.txt");

	}

}
