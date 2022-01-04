/**
 * Test Hello Thread
 * 
 * @author Sunil Sahu
 *
 */
public class TestHelloThread extends Thread {

	public static void main(String[] args) {

		HelloThread t1 = new HelloThread("Ram");
		HelloThread t2 = new HelloThread("Shyam");

		t1.start();
		t2.start();

		for (int i = 0; i < 500; i++) {
			System.out.println("Main");
		}

	}

}
