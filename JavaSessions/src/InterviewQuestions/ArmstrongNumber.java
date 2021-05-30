package InterviewQuestions;

public class ArmstrongNumber {
	
	public static int cube(int x) {
		return x*x*x;
	}
	
	public static boolean IsArmstrong(int num) {
		int temp = num;
		int sum=0;
		
		while(num>0) {
			int r = num%10;
			sum = sum + cube(r);
			num = num/10;
				
		}	
		if(sum==temp)return true;
		else return false;
	}

	public static void main(String[] args) {
		// 153= 1*1*1 + 5*5*5 + 3*3*3;
		//407 = 4*4*4 + 0*0*0 + 7*7*7
		//370, 371
		
		System.out.println(IsArmstrong(153));
		System.out.println(IsArmstrong(370));
		System.out.println(IsArmstrong(0));
		

	}

}
