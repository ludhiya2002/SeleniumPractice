package program;

public class HDFC extends Bank {
		public HDFC(String CustomerName, double initialBalance) {
			super("HDFC", CustomerName,initialBalance);
		}
		
		@Override
		public double getInterestRate() {
			return 2.0;
		}
		

}
