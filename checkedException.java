package first10;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class checkedException {

	/*
	 * checked Exception --> It checks at compile time. It used for recoverable
	 * errors. Developers handle this by try,catch block and throws keyword.
	 */
	
	public static void main(String[] args) {
		try {
			FileReader file = new FileReader("file.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}

	}

}
