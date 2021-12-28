
public class Marksheet implements Comparable<Marksheet> {

	private String rollNo = null;
	private String name = null;
	private int physics = 0;
	private int chemistry = 0;
	private int maths = 0;

	@Override
	public int compareTo(Marksheet m2) {
		return this.rollNo.compareTo(m2.getRollNo());
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}

	public int getChemistry() {
		return chemistry;
	}

	public void setChemistry(int chemistry) {
		this.chemistry = chemistry;
	}

	public int getMaths() {
		return maths;
	}

	public void setMaths(int maths) {
		this.maths = maths;
	}

}
