package sorting;

public class Sortingarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {23,34,45,1,3};
		// Sorting array in descending array
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++)
			if(a[i]<a[j]) {
				int temp=a[i];
			   a[i]=a[j];
			   a[j]=temp;
		}
			
		}
		for(int x:a)
			System.out.println(x);
		// Sorting array in ascending array
		for(int i=0;i<a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
			  if(a[i]>a[j]) {
				int temp=a[i];
				 a[i]=a[j];
				 a[j]=temp;
			}
			}
		}
		for(int x:a)
		   System.out.println(x);
	}

	

}
