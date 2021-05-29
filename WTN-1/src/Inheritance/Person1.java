package inheritance;

public class Person1 {
	private String name;
	private String dob;
	public Person1(String name, String dob) {
		super();
		this.name = name;
		this.dob = dob;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "Person1 [name=" + name + ", dob=" + dob + "]";
	}
}
