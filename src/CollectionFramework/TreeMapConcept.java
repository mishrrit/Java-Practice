package CollectionFramework;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapConcept {

    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {

	// 1.
	TreeMap<Integer, String> map = new TreeMap<Integer, String>();
	map.put(2, "Apple");
	map.put(1, "Amazon");
	map.put(3, "Google");

	System.out.println(map);

	// Using lambda expression
	map.forEach((k, v) -> System.out.println("key is " + k + " Value is " + v));

	// Using Map.entry
	for (Map.Entry m : map.entrySet()) {
	    System.out.println(m.getKey() + " " + m.getValue());
	}

	// Fetching first and last key
	System.out.println(map.lastKey());
	System.out.println(map.firstKey());

	// Fetching KeySet based on head and tail
	Set<Integer> lessThan2 = map.headMap(2).keySet();
	System.out.println(lessThan2);

	Set<Integer> GreaterThan2 = map.tailMap(2).keySet();
	System.out.println(GreaterThan2);

    }

}
