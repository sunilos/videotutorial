
public class Account {

	
	private String owner = null;
	private float balance = 0;

	//default constructor 
	public Account() {
	}

	//Parameterized constructor
	public Account(String o, float b) {
		owner = o;
		balance = b;
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

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
}
