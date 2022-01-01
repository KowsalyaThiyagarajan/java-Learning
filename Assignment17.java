import java.util.Scanner;

//Program to Find the Sum of Natural Numbers Upto N. Hint: (N x (N+1)/2//
public class Assignment17 {

	public static void main(String[] args) {
		Scanner Sd =new Scanner(System.in);
		System.out.println("Enter N number:");
		int N=Sd.nextInt();
		
		int Numbers=(N*(N+1)/2);
		System.out.println("Natural Numbers:"+Numbers);

	}

}
