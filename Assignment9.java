import java.util.Scanner;

//Program to Calculate the Area of a Triangle. Hint: (1/2 x (b x h))//
public class Assignment9 {

	public static void main(String[] args) {
		Scanner sd=new Scanner(System.in);
		System.out.println("Bredth of the Triangle:");
		double bredth=sd.nextDouble();
		
		System.out.println("Height of the Triangle:");
		double height=sd.nextDouble();
		double Area=height*bredth/2;
		
		System.out.println("Area of a Triangle:"+Area);

	}

}
