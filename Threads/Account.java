/**
 * Example of racing condition
 * 
 * @author Sunil Sahu
 *
 */
public class Account {
	/**
	 * Contains balance of amount
	 */
	private int balance = 0;

	/**
	 * Gets the account balance
	 * 
	 * @return
	 */
	public int getBalance() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
		}
		return balance;
	}

	/**
	 * Sets the balance
	 * 
	 * @param balance
	 */
	public void setBalance(int balance) {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
		}
		this.balance = balance;
	}

	/**
	 * Deposits amount in account. It is synchronized, only one thread can
	 * deposit amount at a time.
	 * 
	 * This uses method synchronization
	 * 
	 * @param msg
	 * @param amt
	 */
	public synchronized void deposit(String msg, int amt) {
		int bal = getBalance();
		bal = bal + amt;
		setBalance(bal);
		System.out.println(msg + "  balance " + bal);
	}

}
