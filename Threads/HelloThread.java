/**
 * Create thread by extending Thread class
 * 
 * @author Sunil Sahu
 *
 */
public class HelloThread extends Thread {

	String name = null; // thread Name

	public HelloThread(String tn) {
		name = tn;
	}

	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(i + name);
		}
	}
}
