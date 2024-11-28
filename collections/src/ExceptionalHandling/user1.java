package ExceptionalHandling;

import java.io.File;
import java.io.FileInputStream;

/*
 * Exception - Unexpected event occur during the execution of Program
 * 
 * Error - Syntax Error , Logical Error
 * 
 * Exception Types :
 * Checked Exception , Un-checked exception
 * Checked Exception - can identifies during compile time
 * Un checked exception - execution time
 * 
 * Compile - java code to byte code
 * JVM - Byte code to machine code and perform operation
 * 
 *unchecked exception - Run Time - try/catch block
 *             Arithmetic exception
 *             Null Pointer Exception
 *             String index Out of Bound Exception
 *             Array Index Out of Bound Exception
 *checked Exception -Compile Time - throws
 *               Interrupted Exception
 *               IO Exception
 *               File Not Found
 * 
 * How to handle exception 
 * 
 * try - catch block
 * throws
 *final , finally , finalize 
 * 
 * finalize - calls Garbage Collector to clean up the activity 
 * 
 * 
 * 
 */



public class user1 {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
		
		
		
		user1 uw = new user1();
		
		uw.finalize(); //Deprecated - no longer in user
		
		try
		{
		String [] user = new String [3];
		
		user[7] = "ajay";
		}
		catch (Exception e) {
			
			System.out.println("exception occured");
		
		}
		
		finally
		{
			System.out.println("Finally occured");	
		}
		
				
		
	}

}
