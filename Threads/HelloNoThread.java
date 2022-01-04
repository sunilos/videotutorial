/**
 * A class that is not a Thread
 * 
 * @author Sunil Sahu
 *
 */
public class HelloNoThread {

	String name = null;

	public HelloNoThread(String n) {
		name = n;
	}

	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(i + name);
		}
	}

}
