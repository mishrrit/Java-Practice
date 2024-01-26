package CollectionFramework;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapClass {

    @SuppressWarnings("rawtypes")
    public static void main(String[] args) {

	HashMap<Integer, String> hm = new HashMap<Integer, String>(); // Generic where we are defining the data types as
								      // Integer,String
	// HashMap hm = new HashMap(); //Non generic type where the class is not of
	// specific type
	System.out.println("*************Adding into HashMap****************");
	hm.put(1, "Ritesh");
	hm.put(2, "Sippi");
	hm.put(3, "Reyaan");
	hm.put(4, "Phutni");
	hm.put(4, "Putu");
	hm.put(5, "Phuchku");
	System.out.println(hm);

	System.out.println("*************Removing from HashMap****************");
	hm.remove(5);
	System.out.println(hm);

	System.out.println("*************Using For Loop****************");
	for (int i = 0; i < hm.size(); i++) {
	    System.out.println(hm.get(i + 1));
	}

	System.out.println("*************Using For Loop****************");
	for (int i = 0; i < hm.size(); i++) {
	    System.out.println(hm.get(i + 1));
	}

	System.out.println("*************Using Iterator*****************");
	System.out.println("---------1st way - using entryset--------------------------");
	Set set = hm.entrySet();
	Iterator it = set.iterator();

	while (it.hasNext()) {
	    System.out.println(it.next());
	}

	// 2nd way
	System.out.println("---------2nd way using keyset--------------------------");
	Iterator<Integer> its = hm.keySet().iterator();
	while (its.hasNext()) {
	    Integer key = its.next();
	    String vals = hm.get(key);
	    System.out.println("Key is " + key + " Value is " + vals);

	}

	// 3rd way
	System.out.println("---------3rd way using entryset--------------------------");
	Iterator<Entry<Integer, String>> entry = hm.entrySet().iterator();
	while (entry.hasNext()) {
	    Entry<Integer, String> ent = entry.next();
	    System.out.println("Key is " + ent.getKey() + " value is " + ent.getValue());
	}

	System.out.println("----------4th way -using lambda expression----------------");
	hm.forEach((k, v) -> System.out.println("key is " + k + " and Value is " + v));

	System.out.println("***********************Using Generic Class*****************************");
	HashMap<Integer, GenericClass> GC = new HashMap<Integer, GenericClass>();
	GenericClass g1 = new GenericClass("Ritesh", 33, "TSG");
	GenericClass g2 = new GenericClass("Sippi", 28, "HW");
	GenericClass g3 = new GenericClass("Reyaan", 1, "KIDS");

	GC.put(1, g1);
	GC.put(2, g2);
	GC.put(3, g3);

	for (Entry<Integer, GenericClass> e : GC.entrySet()) {
	    int k = e.getKey();
	    GenericClass Value = e.getValue();
	    System.out.println(k + " Info ");
	    System.out.println("Name:" + Value.Name + "  Age:" + Value.age + "  Department:" + Value.Dept);

	}

    }

}
