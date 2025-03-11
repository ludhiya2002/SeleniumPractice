package abstraction;

public class inheritedabstract extends newabstract {
	public void sample1() {
		System.out.println("overriding abstract method");
	}
	public static void main(String[] args) {
		inheritedabstract obj = new inheritedabstract();
		obj.sample1();
		obj.fun();
		
	}

}
