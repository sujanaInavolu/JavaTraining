package util;

import java.util.Scanner;

public final class MyUtils {
	public static int readInteger(String value) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter " + value + ": ");
		return sc.nextInt();
	}

	public static String readString(String value) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter " + value + ": ");
		return sc.nextLine();
	}
}
