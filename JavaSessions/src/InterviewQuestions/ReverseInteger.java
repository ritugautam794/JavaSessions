package InterviewQuestions;

public class ReverseInteger {

	public static int reverse(int num) {

		int rev = 0;

		while (num > 0) {
			rev = (rev * 10) + num % 10;
			num = num / 10;
		}

		return rev;
	}

	public static void main(String[] args) {

		int x = reverse(12345);
		int y = 98765;

		System.out.println(x);
		
		StringBuffer s= new StringBuffer(String.valueOf(y));
		System.out.println(s.reverse());
		

	}

}
