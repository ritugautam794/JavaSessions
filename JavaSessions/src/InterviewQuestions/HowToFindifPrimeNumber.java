package InterviewQuestions;

public class HowToFindifPrimeNumber {

	public static void main(String[] args) {

		System.out.println("is 5 a prime no: "+ prime(5));
		System.out.println("is 10 a prime no: "+ prime(10));
		System.out.println("is 23 a prime no: "+ prime(23));
		System.out.println("is 93 a prime no: "+ prime(93));
		System.out.println("is 129 a prime no: "+ prime(129));
		
		System.out.println("no of prime solutions: "+ NumberofPrimes(20));
		get_primenumbers(20);
		get_primenumbers(30);

	}
    
	//	To find if given number is prime of not
	public static boolean prime(int x) {

		if (x <= 1) {
			return false;
		}

		for (int i = 2; i < x; i++) {
			if (x % i == 0)
				return false;
			
		}
		
		return true;
	}
	
	//To find how many numbers are prime from 1 to given number
	public static int NumberofPrimes(int x) {
		
		int n=0;
		for(int i=2;i<=x;i++) {
			if(prime(i)==true) {
				n++;
			}		
		}
		 return n;	
	}
	
	public static void get_primenumbers(int x) {
		 for(int i=2; i<=x;i++) {
			 if(prime(i)) {
				 System.out.print(i);
				 System.out.print(" ");
			 }
		 }
		 System.out.println(" ");
	}

}






