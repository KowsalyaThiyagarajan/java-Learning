import java.util.Scanner;

public class solution {
	//There are three lines of output:

//On the first line, print String: followed by the unaltered String read from stdin.
//On the second line, print Double: followed by the unaltered double read from stdin.
//On the third line, print Int: followed by the unaltered integer read from stdin.
//To make the problem easier, a portion of the code is already provided in the editor.//


	 public static void main(String[] args) {
	        Scanner sd=new Scanner(System.in);
	        int Int=sd.nextInt();
	        double Double=sd.nextDouble();
	        sd.nextLine();
	        String string=sd.nextLine(); 
	        
	        System.out.println("String: "+string);
	        System.out.println("Double: "+Double);
	        System.out.println("Int: "+Int);

}
}
