
public class ascending {
	public static void main(String args[]) {
		int num[]= {77,89,4,2,67,33};
		int temp=0;
		System.out.println("Elements:");
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i]>num[j]) {
				temp=num[i];
				num[i]=num[j];
				num[j]=temp;
				
				
			}
		}
	}
	System.out.println("Ascending order:");
	for(int i=0;i<num.length;i++) {
		System.out.println(num[i]);
	}

}
}
	
