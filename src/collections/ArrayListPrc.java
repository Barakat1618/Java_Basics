package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListPrc {

	public static void main(String[] args) {
		
		// An arraylist is a collection of objects whoes size grows dynamically and shrinks dynamically when adding or deleting.
		List<String> al = new ArrayList<String>();
		al.add("Mango");
		al.add("Dates");
		al.add("Grapes");
		
		for(String fruits: al) {
			System.out.println(fruits);
		}
		
		for(int i=0; i<al.size(); i++) {
			System.out.println(al.get(i));
		}

		Iterator<String> it = al.iterator();
		System.out.println("//////////////////////////////");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
//		for(int i=al.size()-1; i>=0; i--) {
//			al.remove(i);
//		}
		
		System.out.println("//////////////////////////////");
		System.out.println(al);
		
		al.set(0, "Zero");
		al.set(1, "First");
		al.set(2, "Second");
		
		al.remove("Second");
		
		System.out.println(al);
		}
}
  