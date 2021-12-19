import java.util.Stack;

/**
 * Test a Stack in Java collection
 * 
 * @author Sunil Sahu
 *
 */
public class TestStack {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("Ram");
		s.push("Shyam");
		s.push("Jai");
		s.push("Vijay");

		System.out.println(s.pop());
		System.out.println(s.pop());
		System.out.println(s.pop());
	}

}
