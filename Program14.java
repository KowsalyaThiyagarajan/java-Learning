package Basics;

public class Program14 {
//14)  Program to Swap Two Variables without causing overflow
	public static void main(String[] args) {
		int a = 73, b= 52;
		System.out.println("Before Swap:");
		System.out.println("A:"+a);
		System.out.println("B:"+b);
		
		a = a^b;
		b = a^b;
		a = a^b;
		
		 System.out.println("After Swap:");
			System.out.println("A:"+a);
			System.out.println("B:"+b);
	}

}
