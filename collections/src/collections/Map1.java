package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Map1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Map is an seperate Interface
		 * HashMap,LinkedHashMap,TreeMap
		 * hashing technique
		 * data stored in the form of Key,Value 
		 * 
		 * 
		 * Insertion Order is maintained 
		 * Duplicate values are allowed
		 * Multiple null values are valued
		 * Key should be unique . if not , it will overwrite from the existing value
		 * key-value pair is called as Entry
		 */
		
		HashMap<Integer, String> hmp = new HashMap();
		
		hmp.put(1, "Ragu");
		
		hmp.put(2, "Ram");
		
		hmp.put(3, "Arun");
		
		hmp.put(4, "Ragu");
		
		hmp.put(5, null);
		
		hmp.put(5, "Arun");
		
		hmp.put(6, null);
		
		hmp.put(7, null);
		
		
		
		
		System.out.println(hmp.entrySet());
		
		//System.out.println(hmp.containsKey(9));
		
		//System.out.println(hmp.containsValue("User"));
		
	Set<Integer>	 st=hmp.keySet();
	
		
	//System.out.println(st);
	
	Collection<String> co=hmp.values();
	
	//System.out.println(co);
	
	Set<Entry<Integer,String>> asd =hmp.entrySet();
	
	for (Entry<Integer, String> entry : asd) {
		
	//int num	=entry.getKey();
		
		if((entry.getKey().equals(7)))
				{
			System.out.println("Key is available");
				}
				
		
		System.out.println(entry.getKey() + " : " + entry.getValue());
		
	}
	
	
	

	}

}
