package palindrome;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		Scanner sc  = new Scanner(System.in);
		x=sc.nextInt();
		switch(x) {
		
		case 2:
			System.out.println("two");
		case 3:
			System.out.println("three");
		default:
			System.out.println("no value");
		}
		
		//String s = "malayalam";
		//StringBuilder sb  = new StringBuilder(s);
		//String output = sb.reverse().toString();
		//System.out.println("output:");
		//if(s.equals(output)) {
		//	System.out.println("is a Palindrome");
		//}
		//else {
		//	System.out.println("not a Palindorme");
		//}
	}
}
