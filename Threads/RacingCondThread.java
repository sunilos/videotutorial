
public class RacingCondThread extends Thread {

	public static Account acc = new Account();

	String name = null;

	public RacingCondThread(String name) {
		this.name = name;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			acc.deposit(name, 1000);
		}
	}

}
