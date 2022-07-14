import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Copy a binary file
 * 
 * @author Sunil Sahu
 *
 */
public class CopyBinaryFile {

	public static void main(String[] args) throws Exception {

		String source = "f:/baby.jpg";
		String target = "f:/baby2.jpg";

		FileInputStream in = new FileInputStream(source);
		FileOutputStream out = new FileOutputStream(target);

		int ch = in.read();
		while (ch != -1) {
			out.write(ch);
			ch = in.read();
		}
		in.close();
		out.close();
		System.out.println(source + " is copied to " + target);

	}

}
