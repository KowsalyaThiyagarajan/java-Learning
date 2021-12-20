import java.util.Scanner;

//Write a program to find the volume of a rectangular water tank. Hint: (1xWxh)//
public class Assignment4 {

	public static void main(String[] args) {
	   Scanner sd = new Scanner(System.in);
	   System.out.println("Enter the Length:");
	   double length=sd.nextDouble();
	   System.out.println("Enter the Width:");
	   double Width=sd.nextDouble();
	   System.out.println("Enter the height:");
	   double height=sd.nextDouble();
	   
	  double volume=length*Width*height;
	  System.out.println("Volume of a rectangular wate tank is:"+volume);

	}

}
