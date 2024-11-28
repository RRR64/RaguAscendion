package SuperKeywords;

//super - will call the immediate parent- constructor , variales , methods

//Super - keyword used only when we have parent-child relationship , that means Inheritance


//public,prot,def,private,static,this,super,final,abstract

//Abstraction, Interface

public class ChildClass extends BaseClass {
	
String name = "Rajesh";
	
	void comment()
	
	{
		super.comment();
		
		//System.out.println(super.name);
		System.out.println( "Print name from Child");
	}
	
	/*
	 * ChildClass()
	 * 
	 * { super();
	 * 
	 * }
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChildClass cs = new ChildClass();
		
		
	cs.comment();
		
		

	}

}
