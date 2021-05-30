package InterviewQuestions;

public class Factorial {
	
	//with recursion
	public static int fact(int num) {
		
		if (num==0) return 1;
		if (num==1) return 1;
		else
		
		return num*fact(num-1);
	}
	
	//without recursion
	public static int fact2(int num) {
		int fact=1;
		
		if(num==0) return fact= 1;
		if(num==1) return fact= 1;
		else
			for(int i=num; i>=1;i--) {
				fact = fact*i;
			}
		
		return fact;
		}

	public static void main(String[] args) {
		// 5! = 5*4*3*2*1;
		//0!= 1
		//1! = 1
		System.out.println("Factorial os 0 : "+fact(0));
		System.out.println("Factorial os 1 : "+fact(1));
		System.out.println("Factorial os 2 : "+fact(2));
		System.out.println("Factorial os 3 : "+fact(3));
		System.out.println("Factorial os 4 : "+fact(4));
		System.out.println("Factorial os 5 : "+fact(5));
		
		System.out.println("************Fact2 method**************");
		System.out.println("Factorial os 5 : "+fact2(5));
		System.out.println("Factorial os 4 : "+fact2(4));
		System.out.println("Factorial os 3 : "+fact2(3));
		System.out.println("Factorial os 2 : "+fact2(2));
		System.out.println("Factorial os 1 : "+fact2(1));
		System.out.println("Factorial os 0 : "+fact2(0));

	}

}
