package inheritance;

public class admin extends developer{
	//public void read() {
	//	System.out.print("Read a code");
		
	//}
	//public void write() {
	//	System.out.println("Write a code");
	//}
	// add or deleting the products
	public void manage() {
		super.read();
		write();
		System.out.println("Manage a code");
	}

}
