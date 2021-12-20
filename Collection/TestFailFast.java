import java.util.ArrayList;
import java.util.Iterator;

/**
 * Example of fail fast condition. If you add, update, remove elements of the
 * collection except for the Iterator own remove() method then Iterator will
 * through ConcurrentModificationException exception.
 * 
 * @author Sunil Sahu
 *
 */
public class TestFailFast {

	public static void main(String[] args) {

		ArrayList c = new ArrayList();

		c.add("Ram");
		c.add("Shyam");
		c.add("Jai");
		c.add("Vijay");

		// Create Iterator
		Iterator it = c.iterator();

		// Addition of new element will raise an exception. comment below
		// statement line#28 to avoid exception
		c.add("Ajay");

		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
