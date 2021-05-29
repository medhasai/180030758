package inheritance;

public class Student extends Person1 {
	private int studentid;

	public Student(String name, String dob, int studentid) {
		super(name, dob);
		this.studentid = studentid;
	}

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + "]";
	}
}