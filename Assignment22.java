import java.util.Scanner;

//Write a program to compute compound interest. Hint: (P (1 + r/n)nt), where P is the initial principal balance, r is the 
//interest rate, n is the number of times interest is compounded per time period and t is the number of time periods//
public class Assignment22 {

	public static void main(String[] args) {
double compound;
double amount;
Scanner sd=new Scanner(System.in);
System.out.println("Intial Principal(P):");
int P=sd.nextInt();
System.out.println("Rate(r):");
double r=sd.nextDouble();
System.out.println("Period of time(t):");
int t=sd.nextInt();

amount= P*(Math.pow((1+r/100),t));
compound=amount-P;

System.out.println("Amount:"+amount);
System.out.println("Compound interest:"+compound);

	}

}
