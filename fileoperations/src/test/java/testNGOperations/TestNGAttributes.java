package testNGOperations;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class TestNGAttributes {

	//To run test multiple times , use Invocation count and to run within time use invocation Timeout
	@Test(invocationCount = 5,invocationTimeOut = 1000,threadPoolSize = 3,expectedExceptions = NoSuchElementException.class)
	public void setup()
	{
		
		System.out.println("Print the Statement");
}

	//By default enabled is true
	@Test(enabled = true)
	public void setup1()
	{
		
		System.out.println("Print the Statement on setup1");
}

	
	@Test(alwaysRun = true,description = "I will execute always",dependsOnMethods = "setup1")
	public void setup2()
	{
		
		System.out.println("Print the Statement on setup2");
}

	
	
	
}
