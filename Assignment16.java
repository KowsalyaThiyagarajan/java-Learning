import java.util.Scanner;

//Find the area of a field in acres, whose length and width are given in feet. Hint: (1 acre= 43,560 sq ft.)//
public class Assignment16 {

	public static void main(String[] args) {
		Scanner sd=new Scanner(System.in);
		System.out.println("Length of the Field:");
		double Length=sd.nextDouble();
		System.out.println("Width of the Field:");
		double Width=sd.nextDouble();
		
		double acre=43560;
		double Field=Length*Width;
		
		System.out.println("Area of a field in acres:"+Field);
		

	}

}
