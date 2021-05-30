package OPPS_Interfaces;

public class HSBC implements USBank,BrazilBank{
	
	//if a class is implementing any interfaces it is mandatory to define all its methods
	
	//methods overriding from USbank
    public void credit(){
    	 System.out.println("HSBC--CREDIT");
     }
    
    public void debit() {
    	System.out.println("HSBC--DEBIT");
    }
    
    public void transfer_money() {
    	System.out.println("HSBC--tranfer money");
    }
    
    //HSBC own methods
    public void edu_loan() {
    	System.out.println("HSBC--education loan");
    }
    
    public void carloan() {
    	System.out.println("HSBC--car loan");
    }
    
    //method overriding from BrazilBank
    public void mutualfunds() {
    	System.out.println("HSBC--Mutualfunds");
    }
	

}
