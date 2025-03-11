package program;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank sbicustomer = new SBI("Ludhiya", 2000);
        Bank hdfccustomer = new HDFC("Sampath", 6000);
        Bank icicicustomer = new ICICI("Neelamma", 7000);

        System.out.println(sbicustomer.getBankName() + " interest rate: " + sbicustomer.getInterestRate() + "%");
        System.out.println(hdfccustomer.getBankName() + " interest rate: " + hdfccustomer.getInterestRate() + "%");
        System.out.println(icicicustomer.getBankName() + " interest rate: " + icicicustomer.getInterestRate() + "%");

        sbicustomer. deposit(3000);
        hdfccustomer. deposit(6000);
        icicicustomer. deposit(8000);

        System.out.println("SBI Balance: " + sbicustomer.getBalance());
        System.out.println("HDFC Balance: " + hdfccustomer.getBalance());
        System.out.println("ICICI Balance: " + icicicustomer.getBalance());
    }
}
