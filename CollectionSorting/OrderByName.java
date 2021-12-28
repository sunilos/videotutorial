import java.util.Comparator;

/**
 * Sort Marksheet by Name
 * @author Sunil Sahu
 *
 */
public class OrderByName implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet m1, Marksheet m2) {
		return m1.getName().compareTo(m2.getName());
	}

}
