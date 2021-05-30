package OOPS_Encapsulation;

public class TestEmployee {

	public static void main(String[] args) {

		EmployeeDetails e = new EmployeeDetails();
		e.setEmpAge(30);
		e.setEmpName("Soumyadeep");
		e.setSsn(12343);

		System.out.println("Employee Age is : " + e.getEmpAge());
		System.out.println("Employee Name is : " + e.getEmpName());
		System.out.println("Employee SSN is : " + e.getSsn());

	}

}
