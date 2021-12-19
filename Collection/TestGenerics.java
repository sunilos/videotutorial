import java.util.ArrayList;
import java.util.Iterator;

/**
 * Example of generics, defining collection data type
 * 
 * @author Sunil Sahu
 *
 */
public class TestGenerics {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<String>();
		names.add("Ram");
		names.add("Shyam");
		names.add("Jai");
		names.add("Vijay");

		String name = names.get(0);

		Iterator<String> it = names.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
