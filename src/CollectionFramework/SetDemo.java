package CollectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		Set<String> set1= new HashSet<String>();
		
		set1.add("Ritesh");
		set1.add("Sippi");
		set1.add("Reyaan");
		
		System.out.println("***Using HashSet*****");
		System.out.println(set1);
		
		Set<String> set2= new LinkedHashSet<String>();
		
		set2.add("Ritesh");
		set2.add("Sippi");
		set2.add("Reyaan");
		
		System.out.println("***Using LinkedHashSet*****");
		System.out.println(set2);
		
		System.out.println("***Using For Loop for HashSet*****");
		for(String s:set1) {
			System.out.println(s);
		}
		
		System.out.println("***Using Iterator for LinkedHashSet*****");
		Iterator<String> it =set2.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Set<String> set3 = new TreeSet<String>();
		set3.add("Ritesh");
		set3.add("Sippi");
		set3.add("Reyaan");
		
		System.out.println("***Using TreeSet*****");
		System.out.println(set3);
		
	}

}
