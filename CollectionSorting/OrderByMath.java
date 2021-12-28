import java.util.Comparator;

/**
 * Sort Marksheet by Maths
 * 
 * @author Sunil Sahu
 *
 */
public class OrderByMath implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet m1, Marksheet m2) {
		return m1.getMaths() - m2.getMaths();
	}

}
