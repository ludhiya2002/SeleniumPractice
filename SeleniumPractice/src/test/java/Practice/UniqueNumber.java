package Practice;

import java.util.HashMap;

public class UniqueNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,4,7,9,6,3,3};
		
		HashMap<Integer,Integer> count = new HashMap<>();
		
		for(int num:a) {
			count.put(num, count.getOrDefault(num,0)+1);
		}
		
		System.out.println("Unique numbers:");
		for(HashMap.Entry<Integer,Integer> entry:count.entrySet()) {
			if(entry.getValue()==1) {
				System.out.println(entry.getKey());
			}
		}

	}

}
