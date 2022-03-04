package maths;

import java.time.LocalDate;
import java.util.Scanner;

import util.MyUtils;

public class ElectricityBill {
	private static final int SERVICE_CHARGE = 10;
	private static final int GST = 15;
	private static final int UNIT_CHARGE = 5;

	public static void main(String[] args) {
		int cmr = MyUtils.readInteger("CMR");
		int omr = MyUtils.readInteger("OMR");
		String name = MyUtils.readString("Custmer Name");
		printBill(cmr, omr, name);
	}

	private static void printBill(int cmr, int omr, String name) {
		System.out.println(cmr);
		System.out.println(omr);
		System.out.println(name);
		System.out.println("######## AP Electricity Board ##########");
		System.out.println("Date: " + java.time.LocalDate.now());
		System.out.println("Name : " + name);
		System.out.println("DueDate: " + LocalDate.now().plusDays(30));
		System.out.println("No of units consumed: " + (cmr - omr));
		System.out.println("Total Charges to be paid: " + getTotalBill(omr, cmr));
	}

	private static int getTotalBill(int omr, int cmr) {
		int billAmount = (cmr - omr) * 5;
		int serviceCharge = (billAmount * 10 / 100);
		int gst = (billAmount * 20 / 100);
		int total = (billAmount + serviceCharge + gst);
		System.out.println("consumed units charge : " + billAmount);
		System.out.println("Service charges : " + serviceCharge);
		System.out.println("GST : " + gst);
		System.out.println("Total : " + total);
		return total;
	}
}
