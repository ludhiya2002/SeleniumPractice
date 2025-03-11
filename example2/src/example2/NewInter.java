package example2;

public interface NewInter {
	private void sam1() {
		System.out.println("private method");
	}
	default void sam() {
		System.out.println("default method");
		sam1();
	}
	static void sam2() {
		System.out.println("static method");
	}
	int a=10;
	void fun();
	void sample1();
	

}
