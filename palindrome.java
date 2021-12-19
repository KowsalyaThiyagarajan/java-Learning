import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
		Scanner sd=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sd.nextInt();
		int orginal_num=num;
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(orginal_num==rev) {
			System.out.println("The number is palindrome:");
		}
		else
			System.out.println("The number is not a palindrome");
	}

}
