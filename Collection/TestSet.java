import java.util.HashSet;
import java.util.Iterator;

public class TestSet {

	public static void main(String[] args) {
		
		HashSet s = new HashSet();

		// Add elements in the collection
		s.add(10); // add integer
		s.add(20.5); // add double
		s.add("Ram"); // add string
		s.add(true); // add boolean
		
		//Check availability
		System.out.println(s.contains("Ram"));

		//Fetch all elements
		Iterator it = s.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
