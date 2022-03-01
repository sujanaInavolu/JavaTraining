package maths;

import java.util.Scanner;

public class Table {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		if (number > 10) {
			System.out.println("error");
		} else {
			printFactorial(number);
			printTable(number);
			printsumNumbers(number);
		}
	}

	private static void printsumNumbers(int number) {
		int i, num = 5, sum = 0;
		for (int i1 = 1; i1 <= num; ++i1) {
			sum = sum + i1;
		}
		System.out.println("Sum of numbers = " + sum);
	}

	private static void printFactorial(int number) {
		int i = 1;
		// 3!=3*2*1=6
		// 4!=4*3*2*1=24
		for (int n = 1; n <= number; n++) {
			i = n * i;
		}
		System.out.println("factorial of " + number + " is " + i);
	}

	private static void printTable(int number) {
		for (int n = 1; n <= 10; n++) {
			System.out.println(n + " * " + number + " = " + (n * number));
		}
	}
}
