
public class salary1 {

	public static void main(String[] args) {
		String name[]={"Kowsi","Ramya","Geetha","Guna","Raju","Rajan","Prabhu","Sowmi","Devaki","Anamika"};
		int sal[]={10000,30000,21000,40000,45000,32000,15000,26000,11000,14000};
		int temp=0;
		int k=0;
		
		System.out.println("Salary above 15000 are:");
		for(int i=0;i<sal.length;i++) {
			if(sal[i]>15000) {
				System.out.println(name[i]+sal[i]);
			}
				
				sal[i]=k;
				{
				for(int a=0;a<sal.length;a++) {
					for(int j=a+1;j<sal.length;j++) {
						if(sal[a]>sal[j]) {
						temp=sal[a];
						sal[a]=sal[j];
						sal[j]=temp;
				
				
			}
					}
				}
		}
	}
	}
}
	
		
				
	