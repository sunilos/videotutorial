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

		FileOutputStream file = new FileOutputStream("f:/object.ser");
		ObjectOutputStream out = new ObjectOutputStream(file);

		Marksheet m = new Marksheet();
		m.name = "Ram";
		m.physics = 89;
		m.chemistry = 99;
		m.maths = 95;

		out.writeObject(m);
		out.close();
		file.close();
	}

}
