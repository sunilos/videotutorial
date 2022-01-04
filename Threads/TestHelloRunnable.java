/**
 * Test Hello Runnable Thread
 * 
 * @author Sunil Sahu
 *
 */
public class TestHelloRunnable extends Thread {

	public static void main(String[] args) {

		Thread t1 = new Thread(new HelloRunnable("Ram"));

		Thread t2 = new Thread(new HelloRunnable("Shyam"));

		t1.start();
		t2.start();

		for (int i = 0; i < 500; i++) {
			System.out.println("Main");
		}

	}

}
