package FinalVsFInallyVsFinalize;

public class FinalizeConcept {
	
	// finalize is a method
	// finally - is a block
	//final is a keyword
	public void finalize() {
		
		System.out.println("inside finalize method");
		
	}

	public static void main(String[] args) {
	 
		
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		f1 = null;
		//f2 = null;
		
		System.gc();
		
		
		

		
	}

}
