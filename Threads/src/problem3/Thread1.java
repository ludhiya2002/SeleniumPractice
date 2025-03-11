package problem3;

public class Thread1 extends Thread{
	// run method 
	public void run() {
		System.out.println("This is a thread");
	}
	public static void main(String[] args) {
		// if thread to execute, we want to create an object
		Thread1 obj = new Thread1();
		System.out.println("This is main");
		obj.start();
		while(obj.isAlive());
		System.out.println("Waiting for thread to complete");
		System.out.println("Back to main");
	}

}
