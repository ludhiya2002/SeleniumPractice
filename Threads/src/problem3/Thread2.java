package problem3;

public class Thread2 implements Runnable{
	
	@Override
	public void run() {
		System.out.println("This is thread2");
	}
	public static void main(String[] args) {
		Thread2 obj = new Thread2();
		Thread t = new Thread(obj);
		t.start();
		System.out.println("This is a main method");
		
	}

}
