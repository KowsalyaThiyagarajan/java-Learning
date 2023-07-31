package first10;

interface lambdaIn{
	public void show();
}
public class lambda {

	public static void main(String[] args) {
		int a,b,res;
		a= 10;
		b= 5;
		res = a+b;
		
		lambdaIn obj =()->{
			System.out.println("Final=>"+res);
		};
		obj.show();

	}

}
