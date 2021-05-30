package ExceptionHandling;

public class ThrowConcept {

	public static void main(String[] args) {
		
		System.out.println("PQR");
		
		try{ 
			throw new Exception("Ritu Exception");
		}catch(Exception e){
			e.printStackTrace();		
		}
			
		System.out.println("ABC");
		
		
		String exe_flag = " ";
		if(exe_flag.equals(" ")) {
			try {
				throw new Exception(" exe_flag is blank exception");			
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("XYZ");

	}

}
