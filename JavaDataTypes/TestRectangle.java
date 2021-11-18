
public class TestRectangle {
	public static void main(String[] args) {
		Rectangle r1 = null;

		r1 = new Rectangle();
		r1.length = 10;
		r1.width = 20;

		System.out.println(r1.length);
		System.out.println(r1.width);
		System.out.println("Area : " + r1.area());

		Rectangle r2 = new Rectangle(10, 5);
		System.out.println(r2.length);
		System.out.println(r2.width);

	}

}
