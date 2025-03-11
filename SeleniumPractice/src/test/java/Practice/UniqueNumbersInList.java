package Practice;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueNumbersInList {
	public static void main(String[] args) {
		
		int a[] = {4,5,5,5,4,6,6,9,4};
		HashSet<Integer> uniqueNumbers = new HashSet<>();
		 for(int num:a) {
			 uniqueNumbers.add(num);
			 }
		 for(int uniqueNum : uniqueNumbers) {
			 System.out.println(uniqueNum);
		 }
		
	}

}
