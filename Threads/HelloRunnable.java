/**
 * Create thread using runnable interface
 * 
 * @author Sunil Sahu
 *
 */
public class HelloRunnable implements Runnable {

	String name = null; 

	public HelloRunnable(String tn) {
		name = tn;
	}

	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(i + name);
		}
	}

	
}
