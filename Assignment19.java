import java.util.Scanner;

//Given the total amount and the tax percentage, calculate the net amount backwards.//
public class Assignment19 {

	public static void main(String[] args) {
		double netamount, gross;
		Scanner sd=new Scanner(System.in);
		System.out.println("Total amount:");
		double total=sd.nextDouble();
		System.out.println("Tax:");
		double tax=sd.nextDouble();
		
		gross = total*(tax/100);
		netamount = total-gross;
		System.out.println("Tax payable of Gross:"+gross);
		System.out.println("Net amount:"+netamount);

	}

}
