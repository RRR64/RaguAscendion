package StringOperationsinJava;

public class StringFunctions {

	public static void main(String[] args) {
	
		//String - Sequence of Characters
		
		//String , String Buffer and String Builder
		
		//String 
		
		//How to declare a String ?
		
		String name1 = "RAGUram";
		
		String name2 = "raguram";
		
		
		
		//Functions on String
		
		//Length of String
		
		System.out.println((name1.length())); //7
		
		System.out.println((name1.toLowerCase())); //raguram
		
		System.out.println((name1.toUpperCase())); //RAGURAM
		
		String name4 = " Raguram ";
		
		System.out.println(name4); //RAGURAM
		
		
		System.out.println((name4.trim())); //RAGURAM- Remove Spaces
		
		//Concat 
		
		String fname = "Raguram";
		
		String lname = "Ramdoss";
		
		System.out.println(fname.concat(lname)); 
		
		System.out.println(fname + lname);
		
		//indexof
		
		String data = "I am the user of this  Account";
		
		System.out.println(data.indexOf('t')); // Returns the index of Particular char or String
		
		
		System.out.println(data.charAt(9));
		
		//Sub-String
		
		System.out.println(data.substring(2));
		
		System.out.println(data.substring(2,12)); // End Index = n-1
		
	System.out.println(data.substring(data.indexOf("Account")));
	
	//Replace
	System.out.println(data.replace("Account", "Organisation"));
	
	//contains
	
	System.out.println(data.contains("am the user"));
	
	//System.out.println(data);
	
	//Equals and Equals IgnoreCase
	
	System.out.println(data.equals("I am the User of this  account"));

	System.out.println(data.equalsIgnoreCase("I am the of this  account"));

		//Split Method
	//--------------------------------------------------------------------
	String a = "Ragu";
	
	String b = "Ragu";
	
	String c = new String ("Ragu");
	
	String d = c;
	
	
	//diff between == and equals 
	
	System.out.println(a.equals(b));
	
	System.out.println(a.equals(c)); // equals check the value of object
	
	System.out.println(a==c); // == checks the object
	
	System.out.println(d==c);
	
	//-------------------------------------------------------------
	
	
	
		
		
		
		
		
		
		
				
		
		
	}

}