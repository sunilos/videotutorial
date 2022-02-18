import java.io.Serializable;

/**
 * Class contains Marksheet data to be serialized and transient data to be
 * discarded.
 * 
 * It implements Serializable to be make class serializable
 * 
 * @author Sunil Sahu
 *
 */
public class Marksheet implements Serializable {

	public String name = null;
	public int maths = 0;
	public int physics = 0;
	public int chemistry = 0;
	private transient int total = 0;
	private transient double percentage = 0;

	/**
	 * Calculates total
	 * 
	 * @return
	 */
	public int getTotal() {
		total = maths + physics + chemistry;
		return total;
	}

	/**
	 * Calculates percentage
	 * 
	 * @return
	 */
	public double getPercentage() {
		percentage = total / 3;
		return percentage;
	}
}