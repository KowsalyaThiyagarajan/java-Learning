// Program to Convert Celsius To Fahrenheit. Hint: F= (Cx 9/5)+32//
import java.util.Scanner;


public class Assignment11 {

	public static void main(String[] args) {
		Scanner sd=new Scanner(System.in);
System.out.println("Enter the Celsius:");
double celsius=sd.nextDouble();
double fahrenheit=(celsius*9)/5+32;
System.out.println("Fahrenheit:"+fahrenheit);
	}

}
