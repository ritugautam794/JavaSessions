package OPPS_Interfaces;

public interface USBank {
	int min_balance = 100;
	
	public void credit();
	
	public void debit();
	
	public void transfer_money();
	
	//Interfaces features:
	//1. only method declaration is allowed
	//2. we cannot define the methods(no method body only prototype)
	//3. we can declare variables but by default variables are of static in nature in intefaces
	//4. value of variables cannot be changed
	//5. No static methods are allowed in interfaces
	//6. no main method is allowed in interfaces
	//7. object of interfaces cannot be created
	//8. Interfaces are abstract in nature

}
