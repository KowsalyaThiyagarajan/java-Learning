//Program to Swap Two Variables//
import java.util.Scanner;


public class Assignment12 {

	public static void main(String[] args) {
		Scanner sd=new Scanner(System.in);
System.out.println("Enter a value:");
int a = sd.nextInt();
System.out.println("Enter b value:");
int b=sd.nextInt();
System.out.println("Before Swap:"+a+" "+b);
int temp = a;
a=b;
b=temp;

System.out.println("After Swap:"+a+" "+b);
	}

}
