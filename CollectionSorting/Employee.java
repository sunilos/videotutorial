/**
 * Example of overriding hascode() and equals() methods
 * 
 * @author Sunil Sahu
 *
 */
public class Employee {

	private int id = 0;
	private String name = null;

	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		return (id == e.getId());
	}

	@Override
	public int hashCode() {
		return id;
	}

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
