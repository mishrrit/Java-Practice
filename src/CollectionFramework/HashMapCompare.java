package CollectionFramework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapCompare {

    public static void main(String[] args) {
	
	HashMap<Integer,String> hash = new HashMap<Integer,String>();
	hash.put(1, "A");
	hash.put(2, "B");
	
	
	HashMap<Integer,String> comp = new HashMap<Integer,String>();
	comp.put(1, "B");
	comp.put(2, "C");
	comp.put(3, "D");
	
	HashMap<Integer,String> third = new HashMap<Integer,String>();
	third.put(1, "B");
	third.put(2, "C");
	third.put(2, "c");
	
	System.out.println(hash.equals(comp));
	System.out.println(comp.equals(third));
	
	Iterator<Entry<Integer,String>> it = hash.entrySet().iterator();
	while(it.hasNext()) {
	    Entry<Integer,String> entry = it.next();
	    System.out.println(entry.getKey()+" "+entry.getValue());	    
	}
	
	// compare key set and values
	System.out.println(hash.keySet().equals(third.keySet()));
	System.out.println(hash.values().equals(third.values()));
	
	//find the odd
	HashSet<Integer> all = new HashSet<Integer>(hash.keySet());
	all.addAll(comp.keySet());
	System.out.println(all.removeAll(hash.keySet()));
	System.out.println(all);
    }

}
