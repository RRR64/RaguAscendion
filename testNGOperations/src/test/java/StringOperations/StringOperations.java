package StringOperations;

public class StringOperations {

	public static void main(String[] args) {
		
		
		String name = "I am the user";
		
		//Length of the String
		
		System.out.println(name.length());
		
		//To upperCase
		
		
		
		System.out.println(name.toUpperCase());
		
		//To LowerCase
		
		System.out.println(name.toLowerCase());
		
		//Concat Strings
		
		String a = " Raguram ";
		
		String b = "Ramdoss";
		
		System.out.println(a.concat(b));
		
		System.out.println(a + " " +  b);
		
		//Remove Spaces in the String
		
		System.out.println(a.trim());
		
		//Sub-String
		
		String user ="Alexa";
		
		System.out.println(user.substring(0));
		
		System.out.println(user.substring(0,4));
		
		//char At
		
		System.out.println(user.charAt(0));
		
		//Char Array
		
		char[] ch = user.toCharArray();
		
		for(int i =0;i<ch.length;i++)
		{
		
		System.out.println(ch[i]);
		
		}
		
		
		//Contains - Case Sensitive
		
		String y = "Raguram";
		
		String z = "ragu";
		
		String x = "raguram";
		
		
		System.out.println(y.contains(z));
		
		//Equals Compare value of the object
		
		System.out.println(y.equals(x));
		
		System.out.println(y.equalsIgnoreCase(x));
		
		
		String w = new String("raguram");
		
		//Compares the value of the object
		
		System.out.println(x.equals(w));
		
		String v = new String("raguram");
		
		System.out.println(v==w); // false bcoz v and w are different objects
		
		String u = w;
		
		System.out.println(u==w); // true bcoz u and w are same objects
		
		//Replace Strings
		
		System.out.println(x.replace("rag", "gar"));
		
		System.out.println(x.replaceAll("raguram", "gar"));
		
		
		String act = "I play Cricket";
		
		System.out.println(act.indexOf("Cricket"));
		
		System.out.println((act.lastIndexOf("I")));
		
		
		String [] arr =act.split(" ");
		
		for (String string : arr) {
			
			System.out.println(string);
			
		}
		// To use double Quotes or single Quotes in between string
		String named = "I am the \"user\" name Raguram";
		
		System.out.println(named);
		
String namede = "I am the \'user\' name Raguram";
		
		System.out.println(namede);
		
String namedf = "I am the \\user\\ name Raguram";
		
		System.out.println(namedf);
		
	String s = "Ragu";
	
	 
	
	System.out.println(s + "Ram");
		
	}

}
