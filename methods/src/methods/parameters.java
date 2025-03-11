package methods;

import java.util.Scanner;

public class parameters {
	public static void add(int x,int y) {
		//x=1;y=2;
		System.out.println(x+y);
		//return x+y;
		
	}
	public static void sub(int x,int y) {
	    //x=1;y=2;
		System.out.println(x-y);
		//return x-y;
	}
	public static int mul(int x,int y) {
		//x=1;y=2;
		//System.out.println(x*y);
		return x*y;
	}
	public static int div(int x,int y) {
		//x=1;y=2;
		//System.out.println(x/y);
		return x/y;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1,b=2;
		System.out.println(mul(a,b));

	}

}
