import java.util.ArrayList;
import java.util.Iterator;

public class ArrayLists {

	public static void main(String[] args) {

ArrayList<String> arr = new ArrayList<>();
arr.add("1");
arr.add("2");
arr.add("3");
arr.add("4");

arr.remove(3);
arr.remove("4");

System.out.println(arr.contains("4"));
arr.get(1);
Iterator<String> it = arr.iterator();
System.out.println(it.hasNext());
System.out.println(it.next());
	}

}
