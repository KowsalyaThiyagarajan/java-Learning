import java.util.Scanner;

//Write a program to calculate the tip to be provided to the waiter, at 5% of bill amount.//
public class Assignment18 {

	public static void main(String[] args) {
		double tip;
		double total;
		Scanner sd = new Scanner(System.in);
		System.out.println("Bill amount:");
		double billamount=sd.nextDouble();
		tip = billamount * 5/100;
		System.out.println("Tip:"+tip);
		total=billamount+tip;
		System.out.println("Total amount:"+total);
	}

}