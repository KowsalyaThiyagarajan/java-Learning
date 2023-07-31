package first10;

public class equalsDifference {

	public static void main(String[] args) {
		String s1 = new String("Kowsi");
		String s2 = new String("Kowsi");

// == compares the object reference points to same memory.(checks two objects are in same memory location) 
		System.out.println(s1 == s2); // returns false

// .equals() compares the actual value of the two objects
		System.out.println(s1.equals(s2)); // returns true
	}

}
