import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * Sort Marksheet collection by Comparators
 * 
 * @author Sunil Sahu
 *
 */
public class SortMarksheetComparator {

	public static void main(String[] args) {

		Marksheet m1 = new Marksheet();
		m1.setRollNo("R01");
		m1.setName("Ram");
		m1.setMaths(99);
		m1.setPhysics(88);
		m1.setChemistry(90);

		Marksheet m2 = new Marksheet();
		m2.setRollNo("R03");
		m2.setName("Shyam");
		m2.setMaths(66);
		m2.setPhysics(88);
		m2.setChemistry(79);

		Marksheet m3 = new Marksheet();
		m3.setRollNo("R02");
		m3.setName("Jai");
		m3.setMaths(76);
		m3.setPhysics(98);
		m3.setChemistry(99);

		Marksheet m4 = new Marksheet();
		m4.setRollNo("R04");
		m4.setName("Vijay");
		m4.setMaths(88);
		m4.setPhysics(78);
		m4.setChemistry(89);

		ArrayList<Marksheet> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);

		// Sort by Comparator
		System.out.println("**Sort by name");

		Collections.sort(list, new OrderByName());
		Iterator<Marksheet> it = list.iterator();
		Marksheet m = null;

		while (it.hasNext()) {
			m = it.next();
			System.out.println(m.getName() + ":" + m.getRollNo());
		}

		System.out.println("**Sort by Maths");

		Collections.sort(list, new OrderByMath());
		it = list.iterator();
		m = null;

		while (it.hasNext()) {
			m = it.next();
			System.out.println(m.getName() + ":" + m.getMaths());
		}

		System.out.println("**Sort by Math Decending");

		Collections.sort(list, new OrderByMathDesc());
		it = list.iterator();
		m = null;

		while (it.hasNext()) {
			m = it.next();
			System.out.println(m.getName() + ":" + m.getMaths());
		}

		System.out.println("**Sort by Physics");

		Collections.sort(list, new OrderByPhysics());
		it = list.iterator();
		m = null;

		while (it.hasNext()) {
			m = it.next();
			System.out.println(m.getName() + ":" + m.getPhysics());
		}

		System.out.println("**Sort by Chemistry");

		Collections.sort(list, new OrderByChemistry());
		it = list.iterator();
		m = null;

		while (it.hasNext()) {
			m = it.next();
			System.out.println(m.getName() + ":" + m.getChemistry());
		}
	}
}
