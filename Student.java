
public class Student {

	public static void main(String[] args) {
		String name[]= {"Kowsi","Ramya","Raju","Rajan","Guna","Geetha","Sowmiya","Devaki","Jaishree","Meenatchi","Mukesh","Prabhu","Giri","Madhu","Siva","Anamika","Ananya","Shree","Abarna","Preethi"};
		int mark[]= {67,78,55,46,88,56,39,77,59,60,90,97,59,70,45,67,87,97,66,88};
		int count_a=0,count_b=0,count_c=0,count_d=0,count_e=0;
		char grade;
		for(int i=0;i<name.length;i++) {
			if(mark[i]>=90) {
				grade='A';
				count_a++;
			}
	                else if(mark[i]>=75) {
				grade='B';
				count_b++;
			}
			else if(mark[i]>=65) {
				grade='c';
				count_c++;
			}
			else if(mark[i]>=50) {
				grade='D';
				count_d++;
			}
			else {
				grade='E';
				count_e++;
			}
		}
		System.out.println("A grade count:"+count_a);
		System.out.println("B grade count:"+count_b);
		System.out.println("c grade count:"+count_c);
	        System.out.println("D grade count:"+count_d);
		System.out.println("E grade count:"+count_e);
		}
	
	}


