import java.util.ArrayList;
import java.util.Iterator;

/**
 * Example of addition of different types of elements in a collection
 * 
 * @author Sunil Sahu
 *
 */
public class TestArrayList2 {

	public static void main(String[] args) {

		ArrayList c = new ArrayList();

		// Add elements in the collection
		c.add(10); // add integer
		c.add(20.5); // add double
		c.add("Ram"); // add string
		c.add(true); // add boolean

		// Fetch the element by index number
		int i = (int) c.get(0);
		double d = (double) c.get(1);
		String s = (String) c.get(2);

		System.out.println(i);
		System.out.println(d);
		System.out.println(s);

		// Check element
		boolean flag = c.contains("Ram");
		System.out.println(flag);

		// Get index number of Ram
		int ind = c.indexOf("Ram");
		System.out.println("Index of Ram " + ind);

		// Replace an element
		c.set(2, "Shyam");

		// Remove an element
		String r = (String) c.remove(2);
		System.out.println(r);

		// Get all elements
		Iterator it = c.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		

	}
}
