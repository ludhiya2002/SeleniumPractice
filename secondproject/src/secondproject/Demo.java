package secondproject;
public class Demo{
	static int a =5,b =6,c,d = 21,f = 31,e;//variable  a is stored 5,b is stored 6 
	static char v = 's';
	
	public static void main(String[] args) {
		c = a+b;
	
		System.out.println("the sum of a and b is:"+c);
	methodA();

	}
	public static void methodA() {
		e= c+d;
		System.out.println("the sum of c and d is:"+e);
		
		ajjapagaRaviteja();
	}
	public static void ajjapagaRaviteja() {
		System.out.println("which song start with letter :"+v);
	 gaddamSai(9);
	}
	public static void gaddamSai(int n) {
		System.out.println("int n ="+n);
		dhanunjay(20);
	}
	public static void dhanunjay(int r) {
		System.out.println("int r:"+r);
		
	}
}