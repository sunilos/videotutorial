
public class Circle {

	public double radius;
	public static final double PI = 3.14;

	public Circle() {
	}
	
	public Circle(double r) {
		radius = r;
	}

	public double area() {
		double area = PI * radius * radius;
		return area;
	}
}
