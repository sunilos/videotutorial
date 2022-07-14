import java.io.FileWriter;
import java.io.PrintWriter;

/**
 * Write data line by line to a text file using PrintWriter object
 * 
 * @author Sunil Sahu
 */
public class WriteFileLineByLine {

	public static void main(String[] args) throws Exception {

		FileWriter out = new FileWriter("f:/newtest.txt");

		// create PrintWriter from writer object
		PrintWriter pw = new PrintWriter(out);

		// Write file lines
		for (int i = 0; i < 5; i++) {
			pw.println(i + " : Line");
		}

		// Close streams
		pw.close();
		out.close();

		System.out.println("Open c:/newtest.txt and see your data");

	}

}
