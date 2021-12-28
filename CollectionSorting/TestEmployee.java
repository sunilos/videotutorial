import java.util.ArrayList;
import java.util.Iterator;

public class TestEmployee {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setId(10);
		e1.setName("Ram");

		Employee e2 = new Employee();
		e2.setId(5);
		e2.setName("Shyam");

		Employee e3 = new Employee();
		e3.setId(3);
		e3.setName("Jai");

		ArrayList<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);

		Iterator<Employee> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next().getName());
		}

	}
}
