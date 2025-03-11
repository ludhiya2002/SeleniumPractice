package wipro2;

import java.util.Scanner;                                     

public class calculator {

		int num1;
		int num2;

	public calculator(int m, int n) {
			 num1=m;
			 num2=n;
		}

	public static void main(String[] args) {
		System.out.println("Enter 1st number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter 2nd number");
		int b=sc.nextInt();
	    System.out.println("choose a number");
	    int x=sc.nextInt();
	    calculator obj=new calculator(a, b);
	    switch (x) {
		case 1: {
			
			obj.add(a,b);
			break;
		}
		case 2:
		{
			obj.subtraction(a,b);
			break;
		}
		case 3:{
			int s=obj.multiplication(a,b);
			
			System.out.println(s);
			break;
		}
		case 4:{
			int s=obj.division(a,b);
			System.out.println(s);
			break;
		}
		default:
			System.out.println("choose correct option");
		}
	    
	}

	private  int division(int num1, int num2) {
		return num1/num2;
		
	}

	private  int multiplication(int num1, int num2) {
		return num1*num2;
		
	}

	private void subtraction(int num1, int num2) {
		int x=num1-num2;
		System.out.println(x);
		
	}

	private void add(int num1,int num2) {
		int x=num1+num2;
		System.out.println(x);
		
	}

	}

