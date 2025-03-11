package sorting;

public class GreatestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {34,5,6,89,56,4};
		int greater=a[0];
		int small=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>greater)
				greater=a[i];
		
		if(a[i]<small) {
			small=a[i];
		}
		}
		System.out.println(greater);
		System.out.println(small);


	}

}
