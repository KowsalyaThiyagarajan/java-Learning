package Basics;

import java.util.Scanner;

public class Program9 {
//9) Program to Calculate the Area of a Triangle. Hint: (1/2 x (b x h))
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base of the triangle:");
		int base = sc.nextInt();
		
		System.out.println("Enter the height of the triangle:");
		int height = sc.nextInt();
		
		//to find Area of a triangle
		int Area = ((base*height)/2);
		
		System.out.println("Area of a triangle:"+Area);

	}

}
