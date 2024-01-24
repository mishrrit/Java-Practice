package CollectionFramework;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapSync {

    public static void main(String[] args) {
	Map<String, String> map1 = new HashMap<String, String>();
	map1.put("1", "Ritesh");
	map1.put("2", "Rati");

	// sysnchronizedMap in HashMap
	Map<String, String> syncMap = Collections.synchronizedMap(map1);
	System.out.println(syncMap);

	// ConcurrentHashMap in HashMap
	ConcurrentHashMap<String, String> conc = new ConcurrentHashMap<String, String>();
	conc.put("3", "Reyaan");
	conc.put("4", "Puttu");

	System.out.println(conc);
	System.out.println(conc.get("3"));

    }

}
