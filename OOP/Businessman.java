
public class Businessman implements SocialWorker, Richman {

	private String name = null;
	private String address = null;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public void earnMoney() {
		System.out.println("Earn Money!!");
	}

	@Override
	public double donation() {
		return 100;
	}

	@Override
	public void party() {
		System.out.println("Hurray Party!!");
	}

	@Override
	public void helpToOthers() {
		System.out.println("Help..");
	}

}
