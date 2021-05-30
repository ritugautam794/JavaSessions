package FinalVsFInallyVsFinalize;

public class FinalConcepts {

	public static void main(String[] args) {
		// Final- if we declare any variable as final, we cant modify its value
		
		
		int i = 10;
		
		System.out.println(i);
		
		i= 20;
		System.out.println(i);
		
		final int x= 10;
		//x= 20;// error:The final local variable x cannot be assigned. 
		      // It must be blank and not using a compound assignment
		System.out.println(x);
		

	}

}
