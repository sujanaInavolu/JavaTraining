package maths;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number: ");
			int number = sc.nextInt();
		//	System.out.println(number);
			if (number>10){
				System.out.println("error");
			}
			else {
				// 1 * 3 = 3
				//2 * 3 = 6
				for(int n=1;n<=10;n++) {
					System.out.println(n+" * "+number +" = "+(n*number) );
					System.out.println(n+" * "+number +" = "+(number*n) );
				}
			}
	}

}
