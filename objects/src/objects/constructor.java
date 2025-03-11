package objects;

//import java.util.Scanner;

//public class constructor {	
	public class constructor {
		int x;
		int y;
		public void add() {
			System.out.println(x+y);
		}
		public void sub() {
			System.out.println(x-y);
		}
		public void mul() {
			System.out.println(x*y);
		}
		public void div() {
			System.out.println(x/y);
		}
		public static void main(String args[]) {
			constructor a = new constructor();
			a.x =8;
			a.y=9;
			a.add();
			a.sub();
			a.mul();
			a.mul();
		}
		
		

	}
