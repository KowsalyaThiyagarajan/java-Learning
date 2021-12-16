import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		String name;
		int age;
		double increment = 0;
		double salary;
		double bonus = 0;
		double salarywithbonus;
		Scanner bc=new Scanner(System.in);
		System.out.println("Name:");
		name= bc.nextLine();
		System.out.println("Age:");
		age=bc.nextInt();
		System.out.println("Salary:");
		salary=bc.nextDouble();
		if (salary>1000) {
		increment=(10/salary)*100;
		}
		
		System.out.println("bonus:"+increment);
		salarywithbonus=(increment+salary);
		System.out.println("Salary with Bonus:"+salarywithbonus);
		}

}
