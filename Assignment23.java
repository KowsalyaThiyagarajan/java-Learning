import java.util.Scanner;

//Given the height of a person in cm print the height in feet and inches. (1 inch= 2.54 cms)//
public class Assignment23 {

	public static void main(String[] args) {
		Scanner sd=new Scanner(System.in);
		System.out.println("Height of a person:");
		double height=sd.nextDouble();
		double inches=height/2.54;
		double feet=inches/12;
System.out.println("Height in inches:"+inches);
System.out.println("Height in feet:"+feet);
	}

}
