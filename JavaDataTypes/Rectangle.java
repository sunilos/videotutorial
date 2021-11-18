
public class Rectangle {
	public int length = 0;
	public int width= 0;
	
	public Rectangle(){
	}
	
	public Rectangle(int l, int w){
		length =l;
		width = w;
	}

	public int area(){
		int area = length * width;
		return area;
	}
}
