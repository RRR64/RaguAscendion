package JavaClasses;

public class MethodOverloading {
	
	
	
	int z ;
	
	String user;
	//Method Overloading - Method name should be same and return type can be same or different 
	
	
	//No of parameter should be different
	
	//Order of Parameter
	
	//tYPE OF Parameter
	
	void print(int a, float b)
	{
	
	

}

	
	void print(int a, String c  )
	{
	
	

}



	public static void main(String[] args) {
		
		MethodOverloading me = new MethodOverloading();
		
		me.print(12, 10.5f);
		
		me.print(12, "Ragu");
		
		
		System.out.println(me.user);
		
		System.out.println(me.z);
		
		
		
}
}