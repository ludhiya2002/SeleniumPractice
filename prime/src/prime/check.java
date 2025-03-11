package prime;

public class check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 13;
		boolean Prime = true;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				Prime = false;
				break;
			}
		}
		System.out.println(Prime);

	}

}
