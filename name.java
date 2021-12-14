
public class name {
	public static void main(String args[]) {
		String name[]= {"kowsi","ramya","geetha","hari","priya"};
		String name1[]= {"kowsi","jai","shree","tamil","priya"};
		
		
		for(int i=0;i<name.length;i++) {
			for(int j=0;j<name1.length;j++) {
				if(name[i]==name1[j]) {
					System.out.println(name[i]);
				}
			}
		}
				}

}
