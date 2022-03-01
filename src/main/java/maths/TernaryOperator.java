package maths;

import java.util.Scanner;

public class TernaryOperator {

	public static void main(String[] args) {
		Scanner sc2 = new Scanner(System.in);
		System.out.println("enter percentage: ");
		int percentage = sc2.nextInt();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a salary: ");
		int salary = sc.nextInt();
		System.out.println("enter a name: ");
		Scanner sc1 = new Scanner(System.in);
		String name = sc1.nextLine();
		String designation = (salary > 10000) ? "officer" : "pune";
		/*
		 * (condition/expression) ? value when it is true : when it is false
		 */
		System.out.println("Ms." + name + " is : " + designation + "and his salary is:" + salary);
		String eligbility = (percentage >=70) ? "eligible" : "noteligible";
		System.out.println("Mr" + name + " percentage is " + percentage + " hence he is: " + eligbility);

	}

}
