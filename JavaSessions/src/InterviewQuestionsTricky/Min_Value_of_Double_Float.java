package InterviewQuestionsTricky;

public class Min_Value_of_Double_Float {

	public static void main(String[] args) {
		// Double MIN_VALUE
		// Float MIN_VALUE
		// which one is bigger? double MIN_VALUE or 0.0d
		// which one is bigger? double MIN_VALUE or NEGATIVE_INFINITY

		System.out.println("********Maximum Values*********");

		System.out.println("Double max value: " + Double.MAX_VALUE);
		System.out.println("Float max value: " + Float.MAX_VALUE);
		System.out.println("Long max value: " + Long.MAX_VALUE);
		System.out.println("Integer max value: " + Integer.MAX_VALUE);

		System.out.println("********Minimum Values*********");

		System.out.println("Double min value: " + Double.MIN_VALUE); // +ve
		System.out.println("Float min value: " + Float.MIN_VALUE); // +ve
		System.out.println("Long min value: " + Long.MIN_VALUE); // -ve
		System.out.println("Integer min value: " + Integer.MIN_VALUE);// -ve

		System.out.println("*********which one is smaller*******");
		
		System.out.println(Math.min(Double.MIN_VALUE, 0.0d));
		System.out.println(Math.min(Double.MIN_VALUE, Double.NEGATIVE_INFINITY));
		System.out.println(Math.min(Integer.MIN_VALUE, 0.0));

	}

}
