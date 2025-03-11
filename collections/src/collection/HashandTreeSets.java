package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashandTreeSets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> h = new HashSet<>();
		//TreeSet<Integer> t = new TreeSet<>();
		Iterator<Integer> i = h.iterator();	
		h.add(21);
		h.add(31);
	    h.add(41);
		i.next();
		while(i.hasNext()) {
		System.out.println(i.next());
		i.remove();
		//System.out.println(h);
		//System.out.println(t.first());
		//System.out.println(t.last());
		//System.out.println(h.remove(31));
		//for(int k:h) {
		//	System.out.println(k);
		}
		

	}

}
