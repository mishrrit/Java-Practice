package CollectionFramework;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HashMapConcept {
    public static Map<String, String> marksMap;

    static {
	marksMap = new HashMap<>();
	marksMap.put("A", "A+Grade");
	marksMap.put("B", "B+Grade");
    }

    public static void main(String[] args) {
	Map<String, Integer> marks = new HashMap<String, Integer>();
	marks.put("Ritesh", 85);
	marks.put("Sippoo", 70);
	marks.put(null, 40);

	// 1. Using HashMap class
	HashMap<String, String> map1 = new HashMap<>();
	Map<String, String> map2 = new HashMap<>();
	map1.put("Name", "Ritesh");
	map2.put("Dept", "QA");

	// 2. Static way: static hash map:
	System.out.println(HashMapConcept.marksMap.get("A"));// will give error if line 10 is missing

	// 3. immutableMap with only one single entry
	Map<String, Integer> map3 = Collections.singletonMap("test", 20);
	System.out.println(map3.get("test"));
	// map3.put("stats",10); // UnsupportedOperationException

	// 4. JDK 8: creating one 2D array of Strings using Stream and collecting in the
	// form of map
	Map<String, String> map4 = Stream.of(new String[][] { { "Tom", "CGrade" }, { "Jack", "Failed" } })
		.collect(Collectors.toMap(data -> data[0], data -> data[1]));

	System.out.println(map4.get("Tom"));
	map4.put("Riya", "AGrade");
	System.out.println(map4.get("Riya"));

	// 5. Using Simple Entry
	Map<String, String> map5 = Stream
		.of(new AbstractMap.SimpleEntry<>("Ritesh", "Excel"), new AbstractMap.SimpleEntry<>("Reyaan", "Brill"))
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	System.out.println(map5.get("Ritesh"));
	map5.put("Rati", "Good");
	System.out.println(map5.get("Rati"));

	// 6 creating an empty map- immutable that cannot be changed and can create up
	// to max 10
	Map<Integer, String> map6 = Map.of(1, "Ritesh", 2, "Rati", 3, "Reyaan", 4, "Upcoming");
	System.out.println(map6.get(4));

	// 7 create an immutable map with size > 10
	Map<String, String> map7 = Map.ofEntries(new AbstractMap.SimpleEntry<>("Ritesh", "Excel"),
		new AbstractMap.SimpleEntry<>("Reyaan", "Brill"));
	System.out.println(map7.get("Ritesh"));
    }

}
