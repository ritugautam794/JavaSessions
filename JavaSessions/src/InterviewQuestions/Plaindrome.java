package InterviewQuestions;

public class Plaindrome {
	
	public static void isPalindrome(int num) {
		
		//151, 123321, 12321
		//teet, tabbat
		
		int t = num;
		int r;
		int sum =0;
				
		while(num>0) {
			r = num%10;
			sum = (sum*10)+r;
			num = num/10;	
		}
		
		if(sum==t) 
		{
			System.out.println("Palindrome");
		}else
		{
			System.out.println("Not a Palindrome");
		}
		 
	}
	
	public static boolean isStringPalindrome(String str) {
		
		int j = str.length()-1;
		
		for(int i=0; i<j;i++,j-- ) {
			if(str.charAt(i)!= str.charAt(j))
				return false;			
		
		}
		return true;
		
	}

	public static void main(String[] args) {
		// To find the code for plaindrome

		isPalindrome(12901);
		isPalindrome(12921);
		
		System.out.println("***********************");
		System.out.println(isStringPalindrome("teet"));
		System.out.println(isStringPalindrome("taste"));
	}

}
