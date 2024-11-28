package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parent1 {
	
	public WebDriver driver;
	@Test
	public void test()
	{
		driver = new  ChromeDriver();
		
		Root rt = new Root();
		
		rt.setDriver(driver);
	}

}
