package program;

//import java.util.ArrayList;
import java.util.Scanner;

public class ATM {
	private double balance; //to store the balance
	private Scanner s; //user input
	
	public ATM() {
		this.balance = 0.0;
		this.s = new Scanner(System.in); //creating new object of scanner to take user input
	}
	public void displayMenu()  {
		while(true) {
			System.out.println("1.Check Balance");
			System.out.println("2.Deposit Money");
			System.out.println("3.Withdraw Money");
			System.out.println("4.Exit");
			
			int choice = getIntegerInput();
			
			//decides the action which the user want to 
			switch (choice){
			  case 1:
				checkBalance();
				break;
			  case 2:
				depositMoney();
				
				break;
			  case 3:
				withdrawMoney();
				break;
			  case 4:
				exit();
				//System.out.println("Thank you for using the ATM");
				return;
			 default:
				System.out.println("Invalid choice. Please enter a number between 1 to 4");
			}
		}
	}
	private void exit() {
		// TODO Auto-generated method stub
		System.out.println("Thank you for using the ATM");
		
	}
	private void withdrawMoney() {
		// TODO Auto-generated method stub
		System.out.println("Enter the withdraw amount:");
		double amount = getValidDoubleInput();
		
		if(amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Successfullly withdraw "+amount);
		}else if(amount>balance) {
			System.out.println("Insufficient funds");
		}else {
			System.out.println("Invalid amount! Please enter positive amount");
		}
		
	}
	private void depositMoney() {
		// TODO Auto-generated method stub
		System.out.println("Enter the amount to deposit:");
		double amount = getValidDoubleInput();
		
		if(amount > 0) {
			balance += amount;
			System.out.println("Successfully deposited"+amount);
		}else {
			System.out.println("Invalid amount! Please enter positive amount");
		}
		
	}
	private double getValidDoubleInput() {
		// TODO Auto-generated method stub
		while(!s.hasNextDouble()) {
			System.out.println("Invalid input.Please enter a valid number:");
			s.next();
		}
		return s.nextDouble();
	}
	private void checkBalance() {
		// TODO Auto-generated method stub
		System.out.println("Current balance is:"+balance);
		
	}
	private int getIntegerInput() {
		// TODO Auto-generated method stub
		while(!s.hasNextInt()) {
			System.out.println("Invalid input.Please enter a valid number:");
			s.next();
		}
		return s.nextInt();
		
	}
	public static void main(String[] args)  {
		ATM a = new ATM();
		a.displayMenu();
	}

}
