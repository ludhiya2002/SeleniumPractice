package inheritance;

public class user {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		guest g = new guest();
		g.read();
		
		developer dev = new developer();
		dev.read();
		dev.write();
		
		admin ad = new admin();
		ad.read();
		ad.write();
		ad.manage();
		
		

	}

}
