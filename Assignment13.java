// Program to Swap Two Variables without using temporary variable//
public class Assignment13 {

	public static void main(String[] args) {
		int a=6;
		int b=3;
		System.out.println("Before Swap:"+a+" "+b);
		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println("After Swap:"+a+" "+b);
	}

}
