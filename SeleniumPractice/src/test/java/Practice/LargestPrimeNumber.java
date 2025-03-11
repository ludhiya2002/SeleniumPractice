package Practice;

public class LargestPrimeNumber {
	
	public static void main(String[] args) {
		int n = 455;
		System.out.println("Largest Prime Factor is:"+ findLargestPrimeFactor(n));
	}
	public static int findLargestPrimeFactor(int a) {
		int LargestFactor = -1;
		
		while(a%2==0) {
			LargestFactor=2;
			a/=2;
		}
		for(int i=3; i<Math.sqrt(a); i+=2) {
			while(a%i==0) {
				LargestFactor=i;
				a/=i;
			}
		}
		if(a>2) {
			LargestFactor = a;
		}
		return LargestFactor;
	}

}
