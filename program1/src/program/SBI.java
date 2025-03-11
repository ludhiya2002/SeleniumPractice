package program;

class SBI extends Bank{

	public SBI(String CustomerName, double initialBalance) {
		super("SBI", CustomerName,initialBalance);
	}
	
	@Override
	public double getInterestRate() {
		return 1.0;
	}
class HDFC extends Bank{
	public HDFC(String CustomerName, double initialBalance) {
		super("HDFC", CustomerName,initialBalance);
	}
	
	@Override
	public double getInterestRate() {
		return 2.0;
	}
class ICICI extends Bank{
	public ICICI(String CustomerName,double initialBalance) {
		super("ICICI",CustomerName,initialBalance);
	}
	
	@Override
	public double getInterestRate() {
		return 3.0;
	}
}

}

}
