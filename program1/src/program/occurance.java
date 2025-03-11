package program;

import java.util.Scanner;

public class occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		//input of string
		System.out.println("Enter the String:");
		String str = s.nextLine();
		//input character to count
		System.out.println("Enter the character:");
		char ch = s.nextLine().charAt(0);
		
		int count = 0;
		
		// loop for string count
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println("In Java Programming occurs:"+ ch  +  count+ " times in the string" );

	}

}
