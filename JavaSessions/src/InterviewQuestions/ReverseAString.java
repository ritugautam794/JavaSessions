package InterviewQuestions;

public class ReverseAString {
	
	public static String reverse(String x) {
		int len = x.length();
		String rev = "";
		
		for(int i= len-1;i>=0;i--) {
		 rev = rev + x.charAt(i);
		}
		
		return rev;
	}

	public static void main(String[] args) {
		// 
		ReverseAString r = new ReverseAString();
		 
		String v= reverse("heelo");
		System.out.println(v);
		
		//2. StringBuffer
		
		String t= "hellybelly";
		
		StringBuffer s = new StringBuffer(t);
		System.out.println(s.reverse());

	}

}
