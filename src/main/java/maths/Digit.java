package maths;

import java.util.Scanner;

public class Digit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		System.out.println("Last digit: " + number + " :" + firstDigit(number));
		System.out.println("Last Digit: " + number + " :" + LastDigit(number));

	}

	private static int LastDigit(int number) {
		return (number % 10);

	}

	private static int firstDigit(int number) {
		while (number >= 10) {
			// number /= 10;
			// number +=10;
			// number -=10;
			number = number / 10;
			System.out.println("number: " + number);
		}
		return number;
	}
}
