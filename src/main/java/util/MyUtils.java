package util;

import java.util.Scanner;

public final class MyUtils {
	public static int readInteger() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		return sc.nextInt();
	}
}
