public class Account {

	private String number = null;
	private String type = null;
	private float balance = 0;

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public float getBalance() {
		return balance;
	}

	public float deposit(float amount) {
		balance = balance + amount;
		return balance;
	}

	public float withdraw(float amount) {
		balance = balance - amount;
		return balance;
	}

}
