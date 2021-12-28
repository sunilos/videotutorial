import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Sort a collection of integers
 * 
 * @author Sunil Sahu
 *
 */
public class TestSortNum {

	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(1);
		list.add(20);
		list.add(12);

		Collections.sort(list);

		Iterator<Integer> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
