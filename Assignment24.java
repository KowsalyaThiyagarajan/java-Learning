import java.util.Scanner;

// Program to Check if a Number is Positive, Negative or 0//
public class Assignment24 {

	public static void main(String[] args) {
		Scanner sd = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=sd.nextInt();
if(number>0) {
	System.out.println("Number is positive");
}
else if(number<0) {
	System.out.println("Number is Negative");
}
else {
	System.out.println("Number is zero");
}
	}

}
