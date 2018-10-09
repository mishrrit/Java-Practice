package CollectionFramework;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashTableClass {
		//Does not accept null as a key nor value
		//Sysnchronous  i.e. thread safe
		//Performance issue when working in multiple threaded environment
	
	@SuppressWarnings("unchecked")
	public static <E> void main(String[] args) {
		
		System.out.println("Using Hashtable for storing data");
		Hashtable<Integer,String> h = new Hashtable<Integer,String>();
		h.put(1, "Ritesh");
		h.put(2, "Sippi");
		h.put(3, "Reyaan");
		h.put(4, "Puchku");
		
		
		System.out.println(h);
		
		System.out.println("*********************Cloning Object******************");
		Map<Integer, String> h1 = new Hashtable<Integer, String>();
		h1 = (Hashtable<Integer, String>)h.clone();
		System.out.println(h);
		System.out.println(h1);
		
		System.out.println("********************Using Contains/Remove*************");
		System.out.println(h.contains("Ritesh"));
		System.out.println(h.remove(4));
		System.out.println(h);
		
		
		System.out.println("********************Using Clear*************");
		h.clear();
		System.out.println(h);
		System.out.println(h1);
		
		System.out.println("********************Using Enumeration*************");
		
		Enumeration<String> en = ((Hashtable<Integer, String>) h1).elements();
		System.out.println("enumeration has the values ");
		
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		
		
		System.out.println("********************Using Entry Set*************");
		Set<E> x =(Set<E>) h1.entrySet();
		
		System.out.println(x);
		
	}

}
