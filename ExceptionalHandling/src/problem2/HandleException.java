package problem2;

public class HandleException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[] = {1,2,4};
			System.out.println(a[2]);
			int x = 2/0;
			System.out.println("Division is" +x);
		}
		catch(ArrayIndexOutOfBoundsException | NullPointerException e) {
			System.out.println("This is array block");
			System.out.println(e);
			System.out.println("This is arithmetic");
			System.out.println(e);
		}
		catch(ArithmeticException e) {
			System.out.println("This is arithmetic");
			System.out.println(e);
		}
	}
	
}


