package program;

public class even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5,6};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
		int num = arr[i];
			if(num % 2 == 0) {
				sum += num;
				
			}
		}
		System.out.println("Sum of even numbers:"+sum);
	}
}
