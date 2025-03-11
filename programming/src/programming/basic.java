//package programming;


//public class basic {

//	public static void main(String[] args) {
//		System.out.println("This is Eclipse IDE");
//		System.out.print("Hello ");
//		System.out.println("Welcome to Java programming");
//			
//		// TODO Auto-generated method stub
        
//	}

//}

package programming;

public class basic{
	public static void main(String[] args) {
		int i = 10;
		System.out.println(i);
		basic b = new basic();
		System.out.println(b.add(10,30));
		if (30>20) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
	public int add(int a, int b) {
		int c = a+b;
		return c;
	}
}
