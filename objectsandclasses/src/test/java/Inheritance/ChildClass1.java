package Inheritance;

public class ChildClass1 extends BaseClass {
	
	
	/*
	 *Inheritance - Different types - Single inheritance - Parent - Child 
	 * Multi level - grandparent - parent - child
	 * Hierarchial Inheritance - Parent 
	 * child1
	 * child2
	 * child3
	 * Multipe inheritance - Java doesn't support it , acheived through Interface
	 * 
	 * child
	 * 
	 * parent1
	 * parent2
	 * parent3
	 * 
	 * Final keyword and super
	 * 
	 * final - class,variable,methods
	 * 
	 */
	
	
	
	int c = 20;
	
	String user = "Provider";
	
	
	//Method Overriding
	
	
	 void display()
	  
	  {
	  
	  System.out.println("Print Arun from Child Class"); }
	 	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseClass bc = new BaseClass();
		
		
		
		ChildClass1 c1 = new ChildClass1();
		
		BaseClass bc1 = new ChildClass1(); // Type Casting - widening casting , narrowing casting 
		
		ChildClass1 c2 = (ChildClass1) new BaseClass(); // narrowing Casting
		
		
		
		
		
		c1.a=23;
		
		System.out.println(c1.a);
		
		//java ambiguity 
		
		
	}

}
