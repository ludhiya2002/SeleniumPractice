package collection;

import java.util.ArrayList;

import java.util.Comparator;

public class list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		al.add(25);
		al.add(31);
		al.add(27);
		//al.set(1, 42);
		al.sort(Comparator.naturalOrder());
		System.out.println(al.contains(25)); // to check the number is present or not
		System.out.println(al.get(1));
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i)); // output will come sorted the in ascending to descending
		}
		for(int x:al) {
			System.out.println(x);
		}
		
		int a[] = new int[al.size()];
		al.toArray();
	}

}
