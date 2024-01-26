package CollectionFramework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashMapToArrayList {

    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {

	HashMap<String, Integer> map = new HashMap<String, Integer>();

	map.put("Google", 80000);
	map.put("Apple", 50000);
	map.put("Amazon", 30000);

	Iterator it = map.entrySet().iterator();
	while (it.hasNext()) {
	    Map.Entry pairs = (Map.Entry) it.next();
	    System.out.println(pairs.getKey() + "=" + pairs.getValue());

	}
	
	System.out.println("Using lambda expression");
	map.forEach((k,v)-> System.out.println("key ="+k+" Value ="+v));
	
	//Convert HashMap Keys to ArrayList
	List<String> Company = new ArrayList<String>(map.keySet());
	System.out.println("Total company count "+Company.size());
	for (String t : Company) {
	    System.out.println(t);
	}
	
	//Convert HashMap Values to ArrayList
	List<Integer> EmpValue = new ArrayList<Integer>(map.values());
	System.out.println("Total Employee Values count "+EmpValue.size());
	for (int t : EmpValue) {
	    System.out.println(t);
	}	

    }

}
