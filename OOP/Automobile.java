
public class Automobile {
	
	private String color = null;
	private String make = null;
	private int spead = 0;
	private int gear = 0;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getSpead() {
		return spead;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public void applyBreak() {
		this.spead = 0;
	}

	public void accelerator() {
		this.spead++;
	}

	public void changeGear(int g) {
		this.gear += g;
	}

}
