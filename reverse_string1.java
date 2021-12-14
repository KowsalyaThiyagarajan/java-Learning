
public class reverse_string1 {

	public static void main(String[] args) {
		String str="kowsi";
		char a[]=str.toCharArray();
		
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}

	}

}
