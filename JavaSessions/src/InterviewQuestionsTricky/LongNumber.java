package InterviewQuestionsTricky;

public class LongNumber {

	public static void main(String[] args) {
		// What will be the output when you use a long number with L and without L suffix
		
		long nowithoutL = 1000*60*60*24*365;
		long nowithL = 1000*60*60*24*365L;
		
		System.out.println(nowithoutL);//1471228928
		System.out.println(nowithL); //31536000000

		//because we are not using L and max limit of 32 bit integer is 2,147,483,647
		
		//Decimal: 31536000000  , 
		//Binary - 11101010111101100010010110000000000
		// so compiler will remove first 4 significant digits
		//1110+1010111101100010010110000000000 = 1471228928
	}

}
