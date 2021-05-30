package OPPS_Interfaces;

public class TestBank {

	public static void main(String[] args) {
		
		System.out.println("*******STATIC POLYMORPHISM**********");
		HSBC hs = new HSBC();
		
		hs.credit();
		hs.debit();
		hs.transfer_money();
		hs.carloan();
		hs.edu_loan();
		hs.mutualfunds();
		
		
		System.out.println(USBank.min_balance);
		System.out.println(hs.min_balance);
		
		//changing the value of interfaces variables is now allowed
		
		//USBank.min_balance = 200;//this field cannot be assigned gives error
		
		System.out.println("*******DYNAMIC POLYMORPHISM**********");
		// child class object can be referred by parent interface reference variable
		
		USBank us = new HSBC();
		us.credit();
		us.debit();
		us.transfer_money();	
		
	}

}
