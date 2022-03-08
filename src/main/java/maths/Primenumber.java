package maths;

import java.util.Scanner;

public class Primenumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter  a number: ");
	int number = sc.nextInt();
	System.out.println("Number: "+isItPrimenumber(number));
	System.out.println("Enter  a number: ");
	int number2 = sc.nextInt();
	for(int i=1;i<=100;i++) {
		System.out.println(isItPrimenumber(i));
	}
}
 
private static String isItPrimenumber(int number) {
	if(number == 0 || number == 1) return number+" is not prime Number";
	for(int i=2; i<=number/2;i++) {
		if(number%i==0) return number+" is not Prime Number";
	}
	return number+" is a prime Number";
}


}
