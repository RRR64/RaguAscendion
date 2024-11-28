package collections;

import java.util.LinkedList;

public class ArrList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * Insertion Order is  maintained
		 * Duplicate values are  Allowed
		 * Hashing Technique
		 * Not best for Search Operations and Effective insertion and deletion operations
		 */
		LinkedList li = new LinkedList();
		
		li.add("Ragu");
		
		li.add("Ram");
		li.add("Ramdoss");
		li.add("Main");
		li.add("Main");
		li.add("Palayam");
		
		System.out.println(li.toString()); //[Ragu, Ram, Ramdoss, Main, Street, Palayam]
		
		li.addFirst("Arul");
		
		li.addLast("Zaara");
		
		System.out.println(li.toString()); //[Arul,Ragu, Ram, Ramdoss, Main, Street, Palayam,Zaara]
		
		li.poll(); //Remove first objects
		
		System.out.println(li.toString());// [Ragu, Ram, Ramdoss, Main, Street, Palayam,Zaara]
		
		li.pollFirst();
		
		li.pollLast();
		
		System.out.println(li.toString());// [ Ram, Ramdoss, Main, Street, Palayam]
		
		System.out.println(li.peekFirst()); // Ram
		
		System.out.println(li.peekLast()); // Palayam
		
li.offerFirst("AAKAASH"); 
		
		li.offerLast("Zaaiya"); // Palayam
		
li.addFirst("Abbas");
		
		li.addLast("Yaazh"); 
		
		
		System.out.println(li.toString());// [Abbas,Abbas,Ragu, Ram, Ramdoss, Main, Street, Palayam,Zaara,Palayam,Yaazh]
		
		li.addFirst("Ragu");
		
		//li.removeFirstOccurrence("Ragu");
		
		System.out.println(li.toString()); // After Added Objects
		
		li.removeFirstOccurrence("Abbas");
		li.removeLastOccurrence("Palayam");
		
		System.out.println(li.toString()); 
		
		
		

	}

}
