package CollectionFramework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {

	public static void main(String[] args) {
		
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new LinkedList<Integer>();
		
		AddatFront(list1,"Array List");
		AddatFront(list2,"Linked List");
		
		RemoveatFront(list1,"Array List");
		RemoveatFront(list2,"Linked List");
		
		AddatLast(list1,"Array List");
		AddatLast(list2,"Linked List");
		
		RemoveFromLast(list1,"Array List");
		RemoveFromLast(list2,"Linked List");
		
		
		AddinMiddle(list1,"Array List");
		AddinMiddle(list2,"Linked List");
		
		
		RemoveFromMiddle(list1,"Array List");
		RemoveFromMiddle(list2,"Linked List");

	}
	
	private static void AddatLast(List<Integer> list, String string) {
		
		System.out.println(" Adding Elements from Last for  "+string);
		long StartTime = System.currentTimeMillis();
		for(int i=1000000; i<5000000;i++) {
			list.add(i);
		}
		
		long EndTime =System.currentTimeMillis();
		long Duration = EndTime-StartTime;
		System.out.println("Duration for addition is  "+Duration);
		System.out.println("\n*************************\n");
	}
	
	private static void RemoveFromLast(List<Integer> list, String string) {
		System.out.println(" Removing Elements from Last for  "+string);
		long StartTime = System.currentTimeMillis();
		for(int i=1000000-1; i>995000;i--) {
			
			list.remove(i);
		}
		
		long EndTime =System.currentTimeMillis();
		long Duration = EndTime-StartTime;
		System.out.println("Duration for removal is "+Duration);
		System.out.println("\n*************************\n");
		
	}

	private static void AddatFront(List<Integer> list, String string) {
		
		System.out.println(" Adding Elements from Start for  "+string);
		long StartTime = System.currentTimeMillis();
		for(int i=0; i<10000;i++) {
			list.add(i);
		}
		
		long EndTime =System.currentTimeMillis();
		long Duration = EndTime-StartTime;
		System.out.println("Duration for addition is  "+Duration);
		System.out.println("\n*************************\n");
	}
	
private static void RemoveatFront(List<Integer> list, String string) {
		
		System.out.println(" Removing  Elements from Start for  "+string);
		long StartTime = System.currentTimeMillis();
		for(int i=0; i<5000;i++) {
			list.remove(i);
		}
		
		long EndTime =System.currentTimeMillis();
		long Duration = EndTime-StartTime;
		System.out.println("Duration for removal is  "+Duration);
		System.out.println("\n*************************\n");
	}
	private static void RemoveFromMiddle(List<Integer> list, String string) {
		System.out.println(" Removing Elements from Middle for  "+string);
		long StartTime = System.currentTimeMillis();
		for(int i=100000; i>50000;i--) {
			
			list.remove(i);
		}
		
		long EndTime =System.currentTimeMillis();
		long Duration = EndTime-StartTime;
		System.out.println("Duration for removal is "+Duration);
		System.out.println("\n*************************\n");
		
	}

	private static void AddinMiddle(List<Integer> list, String string) {
		
		System.out.println(" Adding Elements from Middle for  "+string);
		long StartTime = System.currentTimeMillis();
		for(int i=10000; i<50000;i++) {
			list.add(i);
		}
		
		long EndTime =System.currentTimeMillis();
		long Duration = EndTime-StartTime;
		System.out.println("Duration for addition is  "+Duration);
		System.out.println("\n*************************\n");
	}

}
