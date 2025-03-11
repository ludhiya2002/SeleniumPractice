package pg1;

public class sample1 {
	public int m;
	
	private String password;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public sample1() {
	m = 5;
	System.out.println();
		
	}
	public sample1(int x) {
		m = x;
	}
	public static String fun(int x,int y,String s) {
		//int x=10,y=20;
		System.out.println(x+y);
		return s;
	}
	public static void fun(String t) {
		System.out.println(t);
	}
	public void fun() {
		System.out.println("parent class fun");
	}
	public static void sub(String s) {
		int x=10,y=15;
		System.out.print(x-y);
		System.out.println(s);
	}
	public static void main(String[] args) {
		int a = 9,b=8;
		System.out.println(fun(a,b,"welcome"));
		sample1 s = new sample1();
		sample1 s1 = new sample1();
		sub(" Hello");
		s.fun();
		s1.m=10;
		s.m=2;
		System.out.println(s1.m);
		System.out.println(s.m);
	}


	}


