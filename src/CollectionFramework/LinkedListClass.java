package CollectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<String>();
		
		System.out.println("*************Adding element to the LInked List************");
		ll.add("Ritesh");
		ll.add("Sippi");
		ll.add("Reyaan");
		
		System.out.println(ll+"\n");
		
		System.out.println("*************Using add first and last feature************");
		
		ll.addFirst("Family");
		ll.addLast("Complete");
		
		System.out.println(ll+"\n");
		
		System.out.println("**************Using removefirst and removeLast Feature*******************");
		ll.add(3,"Phutki");
		ll.add(4,"Phucku");
				
		ll.removeFirst();
		ll.removeLast();
		ll.remove(2);
		
		System.out.println(ll+"\n");
		
		System.out.println("***************************Using for loop ******************************");
		
		for(int i=0;i<ll.size();i++) {
			System.out.println(ll.get(i));
		}
		
		
		System.out.println("***************************Using Advanced for loop ******************************");
		
		for(String s:ll) {
			System.out.println(s);
		}
		
		
		System.out.println("***************************Using while loop ******************************");
		
		int num = 0;
		while(ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
		
		System.out.println("***************************Using Iterator loop ******************************");
		
		Iterator<String>  it = ll.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
