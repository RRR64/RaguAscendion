package JavaClasses;

public class MethodswithParameters {
	
	int c;
	
	int add(int a , int b)
	{
	
		 c = a + b;
		
		return c;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		MethodswithParameters m = new MethodswithParameters();
		m.add(10, 20);
	
	System.out.println(m.c);
		
		
		
		
		
		

	}

}
