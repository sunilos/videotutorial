import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Copy a binary file using try-with-resources block
 * 
 * @author Sunil Sahu
 *
 */
public class CopyFile1 {

	public static void main(String[] args) throws Exception {

		String source = "f:/baby.jpg";
		String target = "f:/baby2.jpg";

		try (FileInputStream in = new FileInputStream(source); FileOutputStream out = new FileOutputStream(target);) {
			int ch = in.read();
			while (ch != -1) {
				out.write(ch);
				ch = in.read();
			}
		}
		System.out.println(source + " is copied to " + target);

	}

}
