import java.io.FileWriter;

public class TestWriteFile {

	public static void main(String[] args) throws Exception {

		FileWriter out = new FileWriter("f:/newtest.txt");
		out.write('A');
		out.write('\n'); // new line character
		out.write("This is line one");
		out.write("This is line two");
		out.close();
		System.out.println("Check f:/newtest.txt");

	}

}
