package collections;

import java.util.ArrayList;
import java.util.HashSet;

public class Set1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * HashSet , LinkedHashSet ,TreeSet
		 * 
		 * HashSet
		 * Insertion Order is not maintained
		 * Duplicate values are not  Allowed
		 * Hashing Technique
		 */
		
		HashSet li = new HashSet();
		
       li.add("Ragu");
		
		li.add("Ram");
		li.add("Ramdoss");
		li.add("Main");
		li.add("Main");
		li.add("Palayam");
		li.add("Sna");
		
		li.remove("Ragu");
		
		
		
		
		System.out.println(li.toString());
		
		ArrayList al = new ArrayList();
		
		al.addAll(li);
		
		System.out.println(al.toString());
		
		
		
		
	}

}
