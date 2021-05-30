package InterviewQuestions;

public class ReverseIntWithoutTemp {

	public static void main(String[] args) {

		int x = 5; //0101
		int y = 10;//1010

		// with temp
//		int temp;
//		temp = x;
//		x = y;
//		y = temp;
		
//		//addition operator
//		x = x+y; //15
//		y= x-y;//15-10 =5
//		x= x-y;//15-5 = 10
		
//		//multiplication operator
//		x = x*y; // x = 50
//		y = x/y; //50/10 = 5
//		x = x/y ; //50/5=10
		
		//using XOR operator 
		x = x^y ;// 1111
		y = x^y ;// 
		x = x^y ;//
		

		System.out.println("x value is: " + x);
		System.out.println("y value is: " + y);

	}

}
