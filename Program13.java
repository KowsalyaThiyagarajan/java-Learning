package Basics;

public class Program13 {
//13)  Program to Swap Two Variables without using temporary variable
	public static void main(String[] args) {
		int a = 72,b = 45;
		System.out.println("Before Swap:");
		System.out.println("A:"+a);
		System.out.println("B:"+b);
		 a = a+b;
		 b = a-b;
		 a = a-b;
		 System.out.println("After Swap:");
			System.out.println("A:"+a);
			System.out.println("B:"+b);
	}

}
