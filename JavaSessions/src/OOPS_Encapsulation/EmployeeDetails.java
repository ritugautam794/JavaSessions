package OOPS_Encapsulation;

public class EmployeeDetails {

	// How to implement encapsulation
	// 1. Define all the class variables as private so that nobody could access it
	// from outside the class

	private String empName;
	private int empAge;
	private int ssn;

	// 2. define public getter and setter methods, so that these variables could be
	// accessed indirectly through these methods

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

}
