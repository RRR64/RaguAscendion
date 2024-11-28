package allurereports;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginPage {
	
	
	
	@BeforeSuite
	public void browserlogin()
	{

		System.out.println("User is logged into the browser login");
		
}
	
	
	@Test
	public void userlogin()
	{

		System.out.println("User is logged into the user login");
		
}
}
