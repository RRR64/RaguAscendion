package statickeywords;

public class Employee {
	
	
	//public , protected , default , private 
	
	//static , final 
	
	//static 
	
	//occupies separate memory and common for all objects for class
	
	//By default , java consider access modifier as default
	
	static int a = 12;
	
	static String sum ()
	{
		
		return "Print Sum";
	}
	
	int b = 15;
	
	 String minus ()
	{
		
		
		return "Print Minus";
	}
	
	//In Static Method ,Static method or variable can be accessed directly without creating the objects 
	 
	 //In Static Method ,Non-Static method or variable cannot be accessed directly without creating the objects 
	 
	 //In normal method , any method or variable can be accessed without object creation
	 
	 void status()
	 {
		 System.out.println(sum());
		 System.out.println(a);
		
		 System.out.println(minus());
		 System.out.println(b);
		
		 
	 
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee em = new Employee();
		
		em.status();

	}

}
