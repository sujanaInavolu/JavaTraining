package maths;

import java.util.Scanner;

public class ElectricityBill {

	private static final int R2 = 345;
	private static final int R1 = 348;
	private static final String R3 = "230";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String CMR = sc.nextLine();
		System.out.println("Enter CMR: ");
		Scanner sc2 = new Scanner(System.in);
		String CMR2 = sc.nextLine();
		System.out.println("Enter CMR: ");
		int i = 1;
		int bill = currentBill(i);
		int R1 = getreadings();
		int R2 = getreadings();
	}

	private static int getreadings() {
		int R3 = R1 - R2;
		return R3;
	}

	private static int currentBill(int i) {
		System.out.println("Bill no: " + i);
		System.out.println("Number of Units consumed: " + R3);
		int servicecharges = 100;
		int GST = 150;
		int unitsconsumed = 230;
		int Amount = unitsconsumed * 10 + servicecharges + GST;
		System.out.println("Amount to be paid: "+Amount);
		return Amount;
	}

}
