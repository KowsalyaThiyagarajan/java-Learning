package first10;
/*
 * A class without a name is known a anonymous inner class
 * Can be used with interface with any no.of abstract method
 */
interface polygon {
	public void show();
}

public class anonymousClass {

	public static void main(String[] args) {
		polygon p1 = new polygon() {
			public void show() {
				System.out.print("Inside class...");
			};

		};
		p1.show();

	}

}
