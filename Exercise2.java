import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		String arr[]=new String[5];
		Scanner input = new Scanner(System.in);
		System.out.print("Enter doctor name here:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=input.next();
		}
		System.out.print("Enter a day:");
		String day=input.next();
		switch(day) {
		case "Monday":
			System.out.print("Doctor Name:"+arr[0]);
			break;
		case "Tuesday":
			System.out.print("Doctor Name:"+arr[1]);
			break;
		case "Wednesday":
			System.out.print("Doctor Name:"+arr[2]);
			break;
		case "Thursday":
			System.out.print("Doctor Name:"+arr[3]);
			break;
		case "Friday":
			System.out.print("Doctor Name:"+arr[4]);
			break;
		default:
			System.out.print("*Saturday and Sunday are Holidays*");
		}
	}
}


		
		
		
		
		
		
		

	


