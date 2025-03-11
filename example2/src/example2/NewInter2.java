package example2;

public interface NewInter2 {
	private void sam3() {
		System.out.println("private method");
	}
	default void sam() {
		System.out.println("default method");
		sam3();
	}
	static void sam4() {
		System.out.println("static method");
	}
	int b=20;
	void fun();
	void sample2();
	}
