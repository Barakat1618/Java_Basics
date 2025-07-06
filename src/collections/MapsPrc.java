package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapsPrc {
	
	public static void main(String[] args) {

		
		HashMap<Integer, String> hm = new  HashMap<Integer, String>();
		
		hm.put(1, "One");
		hm.put(2, "Two");
		hm.put(3, "Three");
		hm.put(4, "Four");
		
		for(Integer val: hm.keySet()) {
			System.out.println(hm.get(val));
		}
		
		removeElements(hm);
		System.out.println(hm);
//		for(Integer val: hm.keySet()) {
//			System.out.println(hm.get(val));
//		}
	}
	
	public static void removeElements(HashMap<Integer, String> hm) {
		hm.clear();
	}
}
