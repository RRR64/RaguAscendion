package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionBasics {

	/*
	 * Basic Java Core Java Advanced Java - Collections , Exceptional Handling
	 * Collections - collection of objects diff b/w elements and objects -
	 * [a,name,true,123] Collections - It's an framework to store objects Insertion
	 * , manipulation , deletion , search , sorting Iterable [ Root Interface]
	 * 
	 * Collection [Interface]
	 * 
	 * 1. List 2.Set [ Child Interface]
	 * 
	 * List 1.Array List 2.Linked List [Implementation Class] Set 1.Hash Set
	 * 2.Linked Hash Set
	 * 
	 * Map 1. HashMap 2.Linked HashMap
	 * 
	 * ArrayList :
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {

		String[] b1 = { "Ragu", "Ram", "Doss" };

		ArrayList a1 = new ArrayList();

		a1.add("Ragu");

		a1.add("Ram");

		a1.add("Ram");

		a1.add(true);

		a1.add('Z');

		a1.add(123);
		
		//a1.add("");

		a1.add(null);

		a1.add(null);
		
		

		
		/*
		 * Insertion order is maintained
		 * Duplicate values are allowed
		 *Multiple values are allowed
		 *Hetrogeneous Objects are allowed 
		 *Efficient for Search Operations
		 *Not Efficient  for Insertion and Deletion Operations
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		ArrayList y1 = new ArrayList();

		y1.addAll(a1);

		System.out.println(a1.toString());

		/*
		 * System.out.println(a1.get(0));
		 * 
		 * System.out.println(a1.remove(2));
		 * 
		 * System.out.println(a1.toString());
		 * 
		 * a1.set(3, "Zaara");
		 * 
		 * System.out.println(a1.toString());
		 * 
		 * System.out.println(a1.isEmpty());
		 * 
		 * a1.clear();
		 * 
		 * System.out.println(a1.isEmpty());
		 * 
		 * 
		 * 
		 * 
		 * 
		 * 
		 * How to print objects in Array List 4 Approaches
		 * 
		 * toString method , for Loop , Enhanced For Loop , Iterator
		 * 
		 * 
		 * 
		 * //System.out.println(a1.toString()); //To String method applicable for Array
		 * List
		 * 
		 * for(int i =0;i<a1.size();i++) {
		 * 
		 * //System.out.print(a1.get(i) + " " );
		 * 
		 * }
		 * 
		 * //Enhanced For Loop
		 * 
		 * for ( String d1 : b1)
		 * 
		 * {
		 * 
		 * //System.out.println(d1); }
		 * 
		 * for ( Object c1 : a1) {
		 * 
		 * //System.out.println(c1);
		 * 
		 * }
		 * 
		 * 
		 * 
		 * Ragu ram true 123 Address
		 * 
		 * 
		 * 
		 * //Iterator
		 * 
		 * Iterator m1 =a1.iterator();
		 * 
		 * while(m1.hasNext()) {
		 * 
		 * // System.out.println(m1.next());
		 * 
		 * 
		 * }
		 */ 
		a1.iterator();
	}

}
