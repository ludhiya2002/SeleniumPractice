package problem2;

import java.io.IOException;

public class HandleException2 {

	public static void main(String[] args) throws ArithmeticException, IOException {
		// TODO Auto-generated method stub
		try {
			int a[] = {1,2,4};
			System.out.println(a[2]);
			int x = 2/0;
			throw new ArithmeticException("it is a throw keyword");
		}
		catch(ArrayIndexOutOfBoundsException | NullPointerException e) {
			System.out.println("This is array block");
			System.out.println(e);
			//System.out.println("This is arithmetic");
			//System.out.println(e);
		}
		catch(ArithmeticException e) {
			System.out.println("This is arithmetic");
			System.out.println(e);
		}
		finally {
			System.out.println("this is finally block");
	}
	


	}

}
