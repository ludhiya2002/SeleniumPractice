package example2;

import java.io.IOException;

public class interface2 implements NewInter,NewInter2{
	public void fun() {
		System.out.println("This is an abstract method");
	}
	public void sample1() {
		System.out.println("This is an abstract method2");
	}
	public void inter2() {
		System.out.println("This is abstract method");
	}
	@Override
	public void sam() {
		// TODO Auto-generated method stub
		NewInter.super.sam();
	}
	public static void main(String[] args) throws ArithmeticException, IOException {
		//using exceptional handling methods
		try {
			//int a[] = {1,2,4,8,9};
			String s = null;
			//System.out.println(a[4]);
			System.out.println(s.length());
			throw new ArithmeticException("it is a number");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("This is array block");
		}
		catch(NullPointerException n) {
			System.out.println("This is null block");
		}
		catch(ArithmeticException e) {
			System.out.println("This is arithmetic");
			System.out.println(e);
		}
		finally {
			System.out.println("This is final block");
		}
		interface2 obj = new interface2();
		obj.fun();
		obj.sample1();
		obj.inter2();
	}
	
}
