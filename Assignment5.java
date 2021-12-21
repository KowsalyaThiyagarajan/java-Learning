import java.util.Scanner;

//Find the Perimeter of a circle given the radius. Hint: (2 x Pi x r)//
public class Assignment5 {

	public static void main(String[] args) {
		double pi=3.14;
		Scanner sd=new Scanner(System.in);
		System.out.println("Enter the radius:");
		double r=sd.nextDouble();
		
		double perimeter=2*pi*r;
		System.out.println("Perimeter of circle is:"+perimeter);
		
		

	}

}
