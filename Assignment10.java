import java.util.Scanner;

//Program to Convert Kilometers to Miles. Hint: (1 mile = 1.60934 km or 1 km = 0.621371 mile)//
public class Assignment10 {

	public static void main(String[] args) {
		Scanner sd=new Scanner(System.in);
System.out.println("Enter the Kilometer:");
double km=sd.nextDouble();

double miles=km*0.621371;
System.out.printf("%.2fKilometer = %.2fmiles:",km,miles);
	}

}
