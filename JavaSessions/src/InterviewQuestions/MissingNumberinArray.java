package InterviewQuestions;

public class MissingNumberinArray {

	public static void main(String[] args) {
		// 
		int a[] = {1,2,3,4,6,7,8,9,10};
		
		int sum_actual=0 ;
		int sum_exp=0 ;
		
		//To find actual sum of array
		for(int i=0;i<a.length;i++) {
			sum_actual = sum_actual + a[i];
		}
		
		System.out.println("Actual Sum of array"+sum_actual);
		
		
		//to find expected sum
		for(int i=1;i<=10;i++) {
			sum_exp = sum_exp + i;
		}
		System.out.println("expected Sum of array"+sum_exp);
		
		int missing_value = sum_exp - sum_actual;
		System.out.println(missing_value);
		

	}

}
