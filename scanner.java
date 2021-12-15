import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		
		Scanner ob =new Scanner(System.in);
		System.out.println("Enter your Details:");
		String name=ob.nextLine();
		int age=ob.nextInt();
		char gender=ob.next().charAt(0);
		long mobilenumber=ob.nextLong();
		double cgpa=ob.nextDouble();
		
		System.out.println("Your name:"+name);
		System.out.println("Your age is:"+age);
		System.out.println("Your Gender is:"+gender);
		System.out.println("Your Mobile Number is:"+mobilenumber);
		System.out.println("Your cgpa:"+cgpa);

	}

}
