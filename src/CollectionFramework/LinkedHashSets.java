package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class LinkedHashSets {

    public static void main(String[] args) {
	
	ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,2,2,3,4,5,6,5,4,7,8,9));
	
	LinkedHashSet<Integer> hash = new LinkedHashSet<Integer>(numbers);
	//1. Iterating over the hash sets
	Iterator<Integer> it = hash.iterator();
	while(it.hasNext()) {
	    System.out.println(it.next());
	}
	
	//2. Storing the hash sets in another array list
	ArrayList<Integer> noDups = new ArrayList<Integer>(hash);
	System.out.println(noDups);
	
	//3. using stream
	List<Integer> remdup = numbers.stream().distinct().collect(Collectors.toList());
	System.out.println(remdup);
    }

}
