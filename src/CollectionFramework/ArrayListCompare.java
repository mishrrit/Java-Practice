package CollectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListCompare {

    public static void main(String[] args) {
	ArrayList<String> l1 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
	ArrayList<String> l2 = new ArrayList<String>(Arrays.asList("B","A","C","D","G"));
	
	Collections.sort(l1);
	Collections.sort(l2);
	
	//compare 2 arrays
	System.out.println(l1.equals(l2));
	
	//retain common element
	l1.retainAll(l2);
	System.out.println(l1);
	
	ArrayList<String> l3 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
	ArrayList<String> l4 = new ArrayList<String>(Arrays.asList("B","A","C","D","G"));
	
	//remove the common element
	l3.removeAll(l4);
	System.out.println(l3);
	
	
	
	

    }

}
