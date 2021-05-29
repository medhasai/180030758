package inheritance;


public class Teacher extends Person1 {
	private double salary;
	private String subject;
	public Teacher(String name, String dob, double salary, String subject) {
		super(name, dob);
		this.salary = salary;
		this.subject = subject;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Teacher [salary=" + salary + ", subject=" + subject + "]";
	}
}