package fibanoci;

import java.util.Scanner;

public class fibanociseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Enter the sequence");
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int a=0;
			int b=1;
			for(int i=0;i<=n;i++) {
				System.out.println(a+" ");
				int temp=a+b;
				a=b;
				b=temp;
				
				
			}


	}

}
