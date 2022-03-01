package controlflow;

public class IfStatements {
	public static void main(String[] args) {
		int age = 10;
		if (age <= 18) {
			System.out.println("Teenage person");
		} 
		else if(age>=20 & age<=30) {
			System.out.println("Young person");
		}
		else if(age>=30 & age<=40) {
			
			System.out.println("Adult Person");
		}
		else if(age>=50 & age<=60) {
			System.out.println("senior Person");
		}
		else {
			System.out.println("Children");
		}
	}
}
