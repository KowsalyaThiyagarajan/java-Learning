package Basics;

public class Program12 {
//12) Program to Swap Two Variables
	public static void main(String[] args) {
		int a = 32 , b = 72,c;
		System.out.println("Before Swap:");
		System.out.println("A:"+a);
		System.out.println("B:"+b);
		
		c = a;
		a = b;
		b = c;
		
		System.out.println("After Swap:");
		System.out.println("A:"+a);
		System.out.println("B:"+b);

	}

}
