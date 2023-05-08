package Basics;

import java.util.Scanner;

public class Program10 {
/*10) Program to Convert Kilometers to Miles. 
 * Hint: (1 mile = 1.60934 km or 1 km = 0.621371 mile)
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter kilometer:");
		int km = sc.nextInt();
		
		//to convert km to miles
		
		double miles = km*0.621371;
		
		System.out.println(km+" "+"kilometer:"+miles);

	}

}
