package method;

import java.util.Scanner;

class check {

	public static void checkeven(int n){
		// TODO Auto-generated method stub
		if(n==2) {
			System.out.println("is even");
		}
		else {
			System.out.println("is odd");
		}

	}
	public static void checkprime(int x) {
		boolean prime = true;
		for(int i=0;i<x;i++) {
			if(x%i==0) {
				prime = false;
				break;
			}
			
		}
		System.out.println(prime);
		
	}
	public class Main{
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the number:");
			int n = s.nextInt();
			check.checkeven(n);
			check.checkprime(n);
			
			
			
		}
		
	}
	

}
