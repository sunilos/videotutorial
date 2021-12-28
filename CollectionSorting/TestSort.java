import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Sort a collection of strings
 * 
 * @author Sunil Sahu
 *
 */
public class TestSort {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("Ram");
		list.add("Shyam");
		list.add("Jay");
		list.add("Vijay");
		list.add("Abhay");
		list.add("Zabbar");

		Collections.sort(list);

		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
