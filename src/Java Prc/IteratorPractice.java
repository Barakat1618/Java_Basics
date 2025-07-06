import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class IteratorPractice {

	public static void main(String[] args) {
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("sfsf1");
		list.add("sfsf2");
		list.add("sfsf3");
		list.add("sfsf4");
		list.add("sfsf5");
		list.add("sfsf6");
		list.add("sfsf7");
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("///////");
		list.push("sfsf3");
		list.poll();
		for(String val : list) {
			System.out.println(val);
		}
		
		
		Set<String> sets = new LinkedHashSet<>();
		
		sets.add("b");
		sets.add("d");
		sets.add("a");
		sets.add("c");
		sets.add("");
		
		for(String val : sets) {
			System.out.println(val);
		}
		
		
		Iterator<String> sd = sets.iterator();
		while(sd.hasNext()) {
			System.out.println(sd.next());
		}
		
		
		Map<Integer, String> maps = new HashMap<>();
		maps.put(1, "one");
		maps.put(2, "two");
		maps.put(3, "three");
		maps.put(4, "four");
		
		maps.remove(4);
		
		for(Integer num : maps.keySet()) {
			System.out.println(num + " : " + maps.get(num));
		}
		
		maps.put(0, "zero");
		for(Integer num : maps.keySet()) {
			System.out.println(num + " : " + maps.get(num));
		}
		
		
	}

}
