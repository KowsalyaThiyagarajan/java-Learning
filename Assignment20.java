

//Given the basic pay, DA% and TA%, PF@ 8% deduction, calculate the gross pay. Hint: (BasicPay + DA + TA-PF)//
public class Assignment20 {

	public static void main(String[] args) {
		int basicpay= 10000;
		double DA = basicpay*0.05;
		System.out.println("DA:"+DA);
		double TA = basicpay*0.08;
		System.out.println("TA:"+TA);
		double PF = basicpay*0.08;
		System.out.println("PF:"+PF);
		
		double grosspay = basicpay+DA+TA-PF;
		System.out.println("Gross Pay:"+grosspay);
 		
	}

}
