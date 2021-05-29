package inheritance;

public class Collegestudent extends Student {
	private String collegename;

	public Collegestudent(String name, String dob, int studentid, String collegename) {
		super(name, dob, studentid);
		this.collegename = collegename;
	}

	public String getCollegename() {
		return collegename;
	}

	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}

	@Override
	public String toString() {
		return "Collegestudent [collegename=" + collegename + "]";
	}
}