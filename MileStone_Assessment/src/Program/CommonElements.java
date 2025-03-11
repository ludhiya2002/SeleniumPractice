package Program;

import java.util.HashSet;

public class CommonElements {
	public static void main(String[] args) {
		int arr1[]= {1,4,7,9,2};
		int arr2[] = {1,7,3,4,5};
		
		HashSet<Integer> set = new HashSet<>();
		for(int num:arr1) {
			set.add(num);
			}
		System.out.println("Common elements:");
		for(int num:arr2) {
			if(set.contains(num)) {
				System.out.println(num+" ");
			}
		}
	}

}
