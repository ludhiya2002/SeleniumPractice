package program;

public class odd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10,15,20,25,30,35,40};
		int sum = 0;
		for(int i=0;i<arr.length;i++) {
			int num = arr[i];
			if(num % 2 !=0) {
				sum += num;
			}
		}
		System.out.println("Sum of odd numbers:"+sum);

	}

}
