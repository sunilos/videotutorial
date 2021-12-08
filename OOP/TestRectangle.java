
public abstract class TestRectangle {

	public static void main(String[] args) {

		Rectangle r = new Rectangle();
		r.setColor("Red");
		r.setBorderWidth(10);
		r.setLength(10);
		r.setWidth(20);

		System.out.println(r.getLength());
		System.out.println(r.getWidth());
		System.out.println(r.area());

	}

}
