import java.util.ArrayList;

public class TestArrayList {

	public static void main(String[] args) {
		ArrayList c = new ArrayList();
		c.add(1);
		c.add(2);
		c.add(3);
		c.add(4);

		System.out.println("Size: " + c.size());
		System.out.println(c.get(0));
		System.out.println(c.get(1));
		System.out.println(c.get(2));
		System.out.println(c.get(3));

		// Search an element
		int ind = c.indexOf(3);
		System.out.println("Index " + ind);

	}
}
