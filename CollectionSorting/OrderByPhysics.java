import java.util.Comparator;

/**
 * Sort Marksheet by Physics
 * 
 * @author Sunil Sahu
 *
 */
public class OrderByPhysics implements Comparator<Marksheet> {

	@Override
	public int compare(Marksheet m1, Marksheet m2) {
		return m1.getPhysics() - m2.getPhysics();
	}

}
