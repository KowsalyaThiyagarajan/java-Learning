package Basics;

import java.util.Scanner;

public class Program8 {
//8) Program to find the.square root of a given number. Hint: Use sqrt() function.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		
		// find square root of a number using sqrt function
		double Square = Math.sqrt(num);
		
		System.out.println("Square of a"+" "+num+" "+"is:"+Square);

	}

}
