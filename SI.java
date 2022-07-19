package vinay;

public class SI {
	static int simple_Interest;
	static int principle;
	static int rate;
	static int time;
	static int total_Amount;
	static void simpleInterest() {
	simple_Interest = ((principle*rate*time)/100);
	System.out.println("SimpleInterest = " + simple_Interest);
	total_Amount = principle + simple_Interest;
	System.out.println("Amount to be paid after Loan = " + total_Amount);
	}

}
