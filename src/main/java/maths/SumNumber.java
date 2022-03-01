package maths;

public class SumNumber {
	public static void main(String[] args) {
		sumNumbers(3);
		sumNumbers(5);
		sumNumbers(10);
		sumNumbers2(3);
		sumNumbers2(5);
		sumNumbers2(10);

	}

	public static void sumNumbers2(int number) {
		System.out.println("sum is :" + (number * (number + 1) / 2));
	}

	public static void sumNumbers(int number) {
		int sum = 0;
		for (int i1 = 1; i1 <= number; ++i1) {
			sum = sum + i1;
		}
		System.out.println("Sum of  " + number + " numbers = " + sum);
	}
}
