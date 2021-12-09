
/**
 * Example of Polymorphism
 * 
 * @author Sunil Sahu
 *
 */
public class TestPoly {

	public static void main(String[] args) {
		Shape[] s = new Shape[3];

		Rectangle r = new Rectangle();
		r.setWidth(10);
		r.setLength(20);

		Circle c = new Circle();
		c.setRadius(10);

		Triangle t = new Triangle();
		t.setBase(10);
		t.setHeight(20);

		s[0] = r;
		s[1] = c;
		s[2] = t;

		//Check Polymorphism
		double totalArea = 0;
		for (int i = 0; i < s.length; i++) {
			totalArea += s[i].area();// this line has different behaviour.
		}
		System.out.println(totalArea);
	}

}
