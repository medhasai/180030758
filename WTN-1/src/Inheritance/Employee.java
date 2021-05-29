package inheritance;


public class Employee extends Person{
	private double annual_salary;
	private int emp_yr;
	private String insurance_no;

	public Employee(String name,double a,int y,String i) {
		super(name);
		// TODO Auto-generated constructor stub
		annual_salary=a;
		emp_yr=y;
		insurance_no=i;
		
	}

	public double getAnnual_salary() {
		return annual_salary;
	}

	public void setAnnual_salary(double a) {
		this.annual_salary = a;
	}

	public int getEmp_yr() {
		return emp_yr;
	}

	public void setEmp_yr(int y) {
		this.emp_yr = y;
	}

	public String getInsurance_no() {
		return insurance_no;
	}

	public void setInsurance_no(String i) {
		this.insurance_no = i;
	}

	@Override
	public String toString() {
		return "Employee [annual_salary=" + annual_salary + ", emp_yr=" + emp_yr + ", insurance_no=" + insurance_no
				+ "]";
	}
}