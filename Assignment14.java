import java.util.Scanner;

// Program to Swap Two Variables without causing overflow//
public class Assignment14 {

	public static void main(String[] args) {
		Scanner sd=new Scanner(System.in);
		System.out.println("Enter Value a:");
		int a=sd.nextInt();
		System.out.println("Enter value b:");
		int b=sd.nextInt();
		
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After Swap:"+a+" "+b);

	}

}
