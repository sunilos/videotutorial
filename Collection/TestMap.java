import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * Add and Get elements to a Map
 * 
 * @author Sunil Sahu
 *
 */
public class TestMap {
	public static void main(String[] args) {

		HashMap map = new HashMap();

		// Store key and value pair
		map.put("R01", "Ram");
		map.put("R02", "Shyam");
		map.put("R03", "Jay");
		map.put("R04", "Vijay");

		// Get element by Key
		System.out.print("R03: ");
		System.out.println(map.get("R03"));

		// Get all keys
		Set keys = map.keySet();
		Iterator it = keys.iterator();

		System.out.println("**Keys of Map**");
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// Get all value of Map
		Collection vals = map.values();
		it = vals.iterator();

		System.out.println("**Values of Map**");
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
