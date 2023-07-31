package first10;

public class uncheckedException {

	public static void main(String[] args) {
		int num1 = 12;
		int num2 = 0;

		int res = num1 / num2;

// unchecked exception --> checked at runtime, it is a programming error
// It throws an arithmetic Exception.

		System.out.println(res);

	}

}
