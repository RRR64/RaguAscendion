package JavaClasses;

public class Employee {
	
	
	//Quite similiar to method with respect to declaration 
	
	//Constructor name should be same as class name
	
	//Constructor should not have return type
	
	//Constructor : 
	
	/*
	 * 1. Default cons - without param
	 * 
	 * 2. Parametrized cons - with param
	 */
	
	//Constructor used to intialize value to variable
	  Employee()
	
	{
	
		System.out.println("Print the emp");
	}

	 Employee(String string, String string2) {
		 
		 System.out.println(string.concat(string2));
		 
		 
	}

	 Employee(String string, String string2, String string3) {
		
		// TODO Auto-generated constructor stub
		
		 System.out.println(string.concat(string2).concat(string3));
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee();
		
		Employee e1 = new Employee("Ragu","Ram"); 
		// Constructor will be called while creating object
		Employee e2 = new Employee("Ragu","Ram","Dass"); 
		// Constructor will be called while creating object

	}

}