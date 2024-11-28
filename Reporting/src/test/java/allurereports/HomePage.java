package allurereports;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;

public class HomePage {
	
	
	
	@BeforeSuite
	public void homebrowser()
	{

		System.out.println("User is logged into the home browser");
		
}
	
	@Epic("")
	@Story("")
	@Feature("")
	@Step("")
	@Severity(SeverityLevel.CRITICAL)
	@Test
	public void homelogin()
	{

		System.out.println("User is logged into the home login");
		
}
}
