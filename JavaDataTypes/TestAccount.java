public class TestAccount {
	public static void main(String[] args) {
		Account a = new Account("Ram", 100);
		System.out.println(a.getOwner());
		System.out.println(a.deposit(200));
		System.out.println(a.withdraw(100));
		System.out.println(a.getBalance());
	}
}
