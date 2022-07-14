

import java.io.FileWriter;
import java.io.IOException;

/**
 * Write data to a Text file
 * 
 * @author Sunil Sahu
 *
 */
public class WriteFile {
	public static void main(String[] args) throws IOException {
		FileWriter out = new FileWriter("f:/newtest.txt");
		out.write('A');
		out.write('\n'); // new line character
		out.write("This is line one\n");
		out.write("This is line two");
		out.close();
		System.out.println("See f:/newtest.txt");
	}
}
