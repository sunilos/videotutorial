import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * reads text from the keyboard and stores it into a text file.
 * 
 * @author Sunil Sahu
 */
public class KeyboardToFile {

	public static void main(String[] args) throws IOException {

		// Open keyboard
		InputStreamReader kb = new InputStreamReader(System.in);

		// Enable line by line read
		BufferedReader in = new BufferedReader(kb);

		// Open file to write
		PrintWriter out = new PrintWriter(new FileWriter("f:/temp.txt"));

		System.out.println("Type text at console, type 'quit' to exit");
		// Read line from keyboard
		String line = in.readLine();

		// Exit loop if used types "quit"
		while (!line.equals("quit")) {
			out.println(line);// Write to file
			line = in.readLine();// Read next line
		}

		// Close streams
		out.close();
		kb.close();

		System.out.println("See your text in f:/temp.txt");
		openNotepad();
	}

	/**
	 * Open file in notepad
	 */
	public static void openNotepad() {
		try {
			Runtime rs = Runtime.getRuntime();
			rs.exec("notepad f:/temp.txt");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
