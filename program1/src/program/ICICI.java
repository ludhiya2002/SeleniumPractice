package program;

public class ICICI extends Bank {
	public ICICI(String CustomerName,double initialBalance) {
		super("ICICI",CustomerName,initialBalance);
	}
	
	@Override
	public double getInterestRate() {
		return 3.0;
	}

}
