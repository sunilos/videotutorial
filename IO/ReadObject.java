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

		FileInputStream file = new FileInputStream("f:/object.ser");
		ObjectInputStream in = new ObjectInputStream(file);

		Marksheet m = (Marksheet) in.readObject();

		System.out.println(m.name);
		System.out.println(m.physics);
		System.out.println(m.chemistry);
		System.out.println(m.maths);

		in.close();
		file.close();
	}
}
