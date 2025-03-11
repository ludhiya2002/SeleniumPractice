package program;

public class Bank implements BankOperation{
	private String BankName;
	private String CustomerName;
	private double balance;

public Bank(String BankName,String CustomerName,double initialBalance) {
	this.BankName = BankName;
	this.CustomerName = CustomerName;
	this.balance = initialBalance;
}
public void deposit(double amount) {
	if(amount > 0) {
		balance += amount;
		System.out.println(amount + " deposited+Current balance:" + balance);
		
	}
	else {
		System.out.println("no amount");
	}
}
public void withdraw(double amount) {
	if(amount > 0 && amount <=balance) {
		balance -= amount;
		System.out.println(amount + " withdraw+Current Balance:" + balance);
	}
	else {
		System.out.println("no withdraw amount");
	}
}

public double getBalance() {
	return balance;
}

public String getBankName() {
	return BankName;
}
public String getCustomerName() {
	return CustomerName;
}
public double getInterestRate() {
    return 0.0; // Default interest rate
}
}
