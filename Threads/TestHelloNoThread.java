/**
 * Test HelloNoThread class
 * 
 * @author Sunil Sahu
 *
 */
public class TestHelloNoThread {

	public static void main(String[] args) {
		HelloNoThread t1 = new HelloNoThread("Ram");
		HelloNoThread t2 = new HelloNoThread("Shyam");
		t1.run();
		t2.run();
	}

}
