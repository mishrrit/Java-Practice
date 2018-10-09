package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {

	/**
	 * @param <E>
	 * @ArrayList : this is to differentiate between the static and dynamic array classes
	 * @static array : size cannot be changed during run time  
	 */
	public static <E> void main(String[] args) {
		
		//************************Static Array*****************************************
		int []a  = new int[3]; 
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		
		System.out.println("**************Printing all the elements of the Static array**********");
		for(int i=0; i<3;i++) {
			System.out.println(a[i]);
			}
		
		System.out.println("**************END******************\n");	
		//**********************Dynamic Array using ArrayList****************************
		//Non Generic- Array list are not generalized i.e. can hold any type of data types
		ArrayList ar = new ArrayList();
		ar.add(40);
		ar.add("Ritesh");
		ar.add('R');
		
		System.out.println("**************Printing all the elements of the Dynamic Non Generic Class array**********");
		for(int i=0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		
		
		System.out.println("******************* Adding Set 2 to Set 1**********************");
		ArrayList ar1 = new ArrayList();
		ar1.add(50);
		ar1.add("Sippi");
		ar1.add('R');
		
		ArrayList ar2 = new ArrayList();
		ar2.add(40);
		ar2.add("Ritesh");
		ar2.add('R');
		
		
		ArrayList ar3 = new ArrayList();
		ar3.add(1);
		ar3.add("Reyaan");
		ar3.add('R');
		
		ar2.addAll(ar3);
		ar1.addAll(ar2);
		for(int i=0; i<ar1.size();i++) {
			System.out.println(ar1.get(i));
		}
		
		
		System.out.println("******************* Common Set between the two**********************");
		ArrayList ar4 = new ArrayList();
		ar4.add(50);
		ar4.add("Sippi");
		ar4.add('R');
		
		ArrayList ar5 = new ArrayList();
		ar5.add(40);
		ar5.add("Ritesh");
		ar5.add('R');
		
		ar4.retainAll(ar5);
		for(int i=0; i<ar4.size();i++) {
			System.out.println(ar4.get(i));
		}
		
		System.out.println("******************* Removing  Set 2 from  Set 1**********************");
		
		ArrayList ar6 = new ArrayList();
		ar6.add(50);
		ar6.add("Sippi");
		ar6.add('S');
		
		ArrayList ar7 = new ArrayList();
		ar7.add(40);
		ar7.add("Ritesh");
		ar7.add('R');
		ar6.addAll(ar7);
		
		System.out.println("After adding...");
		for(int i=0; i<ar6.size();i++) {
			System.out.println(ar6.get(i));
		}
		
		System.out.println("After removing...");
		ar6.removeAll(ar7);
		for(int i=0; i<ar6.size();i++) {
			System.out.println(ar6.get(i));
		}
		
		System.out.println("******************* Iterating through Class Object **********************");
		
		GenericClass  GC = new GenericClass("Ritesh", 33, "TSG");
		GenericClass  GC1 = new GenericClass("Sippi", 28, "home");
		GenericClass  GC2 = new GenericClass("Reyaan", 1, "kids");
		
		ArrayList<GenericClass> ar8 = new ArrayList<GenericClass>();
		
		ar8.add(GC);
		ar8.add(GC1);
		ar8.add(GC2);
		
		Iterator<GenericClass> it = ar8.iterator();
		
		while(it.hasNext()) {
			GenericClass Gen=it.next();
			System.out.println(Gen.Name);
			System.out.println(Gen.age);
			System.out.println(Gen.Dept);
		}
		
		
		
		
		
		

	}

}
