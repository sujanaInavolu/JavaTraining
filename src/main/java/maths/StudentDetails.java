package maths;

import java.util.Scanner;

public class StudentDetails {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name: ");
		String name = sc.nextLine();
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter Rollno: ");
		int number = sc.nextInt();
		int s1 = readMarks();
		int s2 = readMarks();
		int s3 = readMarks();
		float percentage = getPercentage(s1, s2, s3);
		getAdmissioncard(name, number, percentage);
	}

	private static void getAdmissioncard(String name, int number, float percentage) {
		System.out.println("Name: " + name);
		System.out.println("number: " + number);
		System.out.println("Percentage: " + percentage);
		String Admission = (percentage >= 75) ? "High" : "Low";
		System.out.println("Admission chances: " + Admission);
	}

	private static float getPercentage(int s1, int s2, int s3) {
		float percentage = (s1 + s2 + s3 )/ 3;
		return percentage;
	}

	public static int readMarks() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks: ");
		int marks = sc.nextInt();
		return marks;

	}

}
