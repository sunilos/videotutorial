import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * It creates PrintWriter object that used to write data line by line
 * 
 * @author Sunil Sahu
 *
 */
public class TestPrintWriter {

	public static void main(String[] args) throws Exception {

		FileWriter writer = new FileWriter("f:/newtest.txt");

		// create PrintWriter fro writer object
		PrintWriter pw = new PrintWriter(writer);

		// Write file lines
		for (int i = 0; i < 5; i++) {
			pw.println(i + " : Line");
		}

		// Close streams
		pw.close();
		writer.close();

		System.out.println("Open c:/newtest.txt and see your data");

	}

}
