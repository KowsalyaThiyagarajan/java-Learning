//Multiples a number by every below number//


public class factorial {

	public static void main(String[] args) {
	int num=6;
	long factorial=1;
	for(int i=1;i<=num;i++) {
		factorial = factorial*i;
	}
	
System.out.println("Factorial of number is:"+factorial);
	}

}
