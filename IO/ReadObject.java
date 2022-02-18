import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * Deserialize an object from a File.
 * 
 * @author Sunil Sahu
 *
 */
public class ReadObject {

	public static void main(String[] args) throws Exception {

		// Open a binary file
		FileInputStream file = new FileInputStream("f:/object.ser");

		// Read an object from file
		ObjectInputStream in = new ObjectInputStream(file);

		// Read object
		Marksheet m = (Marksheet) in.readObject();

		// Display data
		System.out.println(m.name);
		System.out.println(m.physics);
		System.out.println(m.chemistry);
		System.out.println(m.maths);

		// Close the file
		in.close();
		file.close();
	}
}
