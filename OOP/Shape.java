public abstract class Shape {

	private String color = null;
	private int borderWidth = 0;

	public int getBorderWidth() {
		return borderWidth;
	}

	public void setBorderWidth(int bw) {
		borderWidth = bw;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String c) {
		color = c;
	}

	public abstract double area();
}
