import java.util.Comparator;

/**
 * Sort Marksheet by maths in descending order
 * 
 * @author Sunil Sahu
 *
 */
public class OrderByMathDesc implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet m1, Marksheet m2) {
		return m2.getMaths() - m1.getMaths();
	}

}
