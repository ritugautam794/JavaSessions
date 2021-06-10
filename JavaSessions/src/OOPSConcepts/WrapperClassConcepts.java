package OOPSConcepts;

public class WrapperClassConcepts {

	public static void main(String[] args) {
		// 
		
		String x = "100";
		String a = "11.22";
		String b = "true";
		
		
		System.out.println(x+20); //10020
		
		int y= Integer.parseInt(x);  // string to integer
		System.out.println(y+20);
		
		double p = Double.parseDouble(a); //string to double
		System.out.println(100+p);
		
		boolean q = Boolean.parseBoolean(b); //string to boolean
		System.out.println(q+"  oh'yes");
		
		//integer to string
		
		int r = 200;
		String s = String.valueOf(r);
		int t = Integer.valueOf(x);
		
		System.out.println(s+"hi");
		System.out.println(t);
		
		
		String w = "100IA";
		int u = Integer.parseInt(w);	//error (NumberFormatException.java:68)			
		
		
		

		
	}

}
