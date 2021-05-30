package InterviewQuestionsTricky;

public class NotANumberNAN {

	public static void main(String[] args) {
		// NAN - not a number..it means its not defined at all
		
		System.out.println(9/0.0);
		System.out.println(0.0/0.0);
		System.out.println(Math.sqrt(-1));
		
		System.out.println(Float.NaN==Float.NaN);//we cant compare bcz its not defined
		System.out.println(Float.NaN!=Float.NaN);
		System.out.println(Double.NaN==Double.NaN);
		
		double nan = 2.1%0 ;
		System.out.println(2.1%0==nan);
		System.out.println(nan==nan);

	}

}
