
public class descending {

	public static void main(String[] args) {

int num[]= {66,78,34,1,2};
int temp=0;

	System.out.println("Elements:");
	for(int i=0;i<num.length;i++) {
		System.out.println(num[i]);
	}
	for(int i=0;i<num.length;i++) {
		for(int j=i+1;j<num.length;j++) {
			if(num[i]<num[j]) {
				temp=num[i];
				num[i]=num[j];
				num[j]=temp;
			}
		}
	}
				System.out.println("descending order:");
				for(int i=0;i<num.length;i++) {
					System.out.println(num[i]);				
					}
			}
		}
	


	


