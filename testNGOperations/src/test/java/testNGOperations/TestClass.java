package testNGOperations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
//@Listeners(LiClass.class)
public class TestClass extends BaseClass{
	
	WebDriver driver;
	
	@Test
	public void testlogin()
	{
	//BaseClass.setup();
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\raguram.ramdoss\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
	driver.get("https://demo.nopcommerce.com/");
	
		}

}
