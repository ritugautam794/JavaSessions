package InterviewQuestions;

import java.util.Arrays;

public class LargestandSmallest {

	public static void main(String[] args) {

		int numbers[] = { -10, -3, 4, 54, 63, 23, 192, -62, 86 };

		int smallest = numbers[0];
		int largest = numbers[0];

		// Time complexity = 0(n)
		for (int i = 1; i > numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			} else if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}

		System.out.println("Array is : " + Arrays.toString(numbers));
		System.out.println("Array is : " + numbers); // this wont give you array
		System.out.println("smallest is : " + smallest);
		System.out.println("Largest is : " + largest);

	}

}
