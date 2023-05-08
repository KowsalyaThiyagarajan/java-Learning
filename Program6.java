package Basics;

import java.util.Scanner;

public class Program6 {
//6) Given a numerator and denominator, find the quotient and remainder.
	public static void main(String[] args) {
		// Getting input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Numerator:");
		int num = sc.nextInt();
		
		System.out.println("Enter Denominator:");
		int denomi = sc.nextInt();
		
		//To find Quotient
		double quotient = num/denomi;
		System.out.println("Quotient:"+quotient);
		//To find Remainder
		int rem = num%denomi;
		System.out.println("Remainder:"+rem);

	}

}
