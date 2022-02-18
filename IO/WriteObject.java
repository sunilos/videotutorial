import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Serialize an object and write to a file
 * 
 * @author Sunil Sahu
 *
 */
public class WriteObject {

	public static void main(String[] args) throws IOException {

		// Open file
		FileOutputStream file = new FileOutputStream("f:/object.ser");

		// Create ObjectOutputStream
		ObjectOutputStream out = new ObjectOutputStream(file);

		// Create serialized marksheet object
		Marksheet m = new Marksheet();
		m.name = "Ram";
		m.physics = 89;
		m.chemistry = 99;
		m.maths = 95;

		// Write an object

		out.writeObject(m);

		// Close streams
		out.close();
		file.close();
	}

}
