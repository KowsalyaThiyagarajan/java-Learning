package Basics;

public class Program3 {
/*3) Write a program to find the value of a raised to the power of b, 
 * where a and b are positive integers. Use pow() function
 */
	public static void main(String[] args) {
		//declaring variables
		int a,b,res;
		a=2;
		b=6;
		//using pow() function
		res = (int) Math.pow(a, b);
		System.out.println(res);

	}

}
