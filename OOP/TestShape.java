
public class TestShape {
	public static void main(String[] args) {
		Shape s;
		s = new Circle();
		s.setColor("Red");
		s.setBorderWidth(10);

		System.out.println(s.getColor());
		System.out.println(s.getBorderWidth());
	}
}
