/**
 * Example of Autoboxing-unboxing
 * 
 * @author Sunil Sahu
 *
 */
public class TestAutoboxing {
	public static void main(String[] args) {

		double d = 5.5;
		Double od = new Double(d);// wrapping
		double d1 = od.doubleValue();// unwrapping

		char c = 'A';
		Character oc = new Character(c);// wrapping
		char c1 = oc.charValue();// unwrapping

		boolean b = true;
		Boolean ob = new Boolean(b);// wrapping
		boolean b1 = ob.booleanValue();// unwrapping

		// boxing
		od = d; // autoboxing
		d = od; // unboxing

		oc = c;// autoboxing
		c = oc;// unboxing

		ob = b;// autoboxing
		b = ob;// unboxing

		System.out.println(d);
		System.out.println(od);
		System.out.println(c);
		System.out.println(oc);
		System.out.println(ob);
		System.out.println(ob);

	}
}
