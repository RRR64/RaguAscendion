package typeCasting;

public class Cat extends Animal {

String drinkmilk()
	
	{
	return "drinking";
	
}
	
void meow()
	
	{
	
}

	
	public static void main (String[]args)
	{
	
		//Cat c = new Cat();
		
		Animal al = new Cat(); // up-Casting
		
		
		
		
		
		Cat ct = (Cat) al;
		
		
		
		System.out.println(ct.drinkmilk());
		
		
		//types of error : 1. compile time error - Syntax error -
		//2. Logical error - execution error 
		
		//Rule 1 - it should have relationship 
		
		//Rule 2 - Assignment - should be same or casted one
		
		//Rule 3 - underlying object - only during execution - ClassCastException
		
		
		
		
		
		
		//Rule 1 - it should have relationship - 
		
		//Class Cast Exception 
		
		//Erro
		
		/*3- rules it should satisfy
		 * 
		 * 
		 * 
		 * 
		 * 
		 */
		
		
		
		
		
		
		
		
		
		
		
		Animal al2 = new Animal();
		
		
		
}
}
