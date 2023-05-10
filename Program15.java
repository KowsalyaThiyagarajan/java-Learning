package Basics;

import java.util.Random;

public class Program15 {
/*15)  Program to Generate a Random Number between 1 and 100. 
 * Hint: Use Next() method from Random Class
 */
	public static void main(String[] args) {
	//Instance of random
		Random rand = new Random();
		
		//Generate random numbers 1 to 100
		 int rand_int = rand.nextInt(100);
		 
		 System.out.println("Random Numbers from 1 to 100:"+rand_int);

	}

}
