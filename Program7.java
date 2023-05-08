package Basics;

import java.util.Scanner;

public class Program7 {
//7) Program to Find the Square of a given number
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		//To find square
		double square = num * num;
		
		System.out.println("Square of a"+" "+num+" "+"is:"+square);

	}

}
