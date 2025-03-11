package collection;

import java.util.HashMap;
import java.util.TreeMap;

public class HashandTreemaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> h = new HashMap<>();
		TreeMap<Integer,Integer>t=new TreeMap();
		t.put(2, 3);
		t.put(21, 42);
		t.put(1, 55);
		System.out.println(t.get(21));
		System.out.println(t.lastEntry());
		System.out.println(t.firstEntry());
		System.out.println(t.lastKey());
		System.out.println(t.firstKey());
		h.put(1, "Jesus");
		h.put(2, "Loves");
		h.put(3, "You");
		//h.replace(3,"You");
		//h.remove(3);
		System.out.println(h);
		System.out.println(h.keySet());
		System.out.println(h.values());
		System.out.println(h.containsKey(4));
		System.out.println(h.size());
		for(int k:h.keySet()) {
			System.out.println(h.get(h));
		}
	}

}
