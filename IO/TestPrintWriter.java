import java.io.FileWriter;
import java.io.PrintWriter;

public class TestPrintWriter {

	public static void main(String[] args) throws Exception {

		FileWriter writer = new FileWriter("f:/newtest.txt");
		PrintWriter pw = new PrintWriter(writer);

		for (int i = 0; i < 5; i++) {
			pw.println(i + " : Line");
		}

		pw.close();
		writer.close();

		System.out.println("Check c:/newtest.txt");

	}

}
