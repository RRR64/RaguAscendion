package allurereports;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	@Test
	public void setup()
	{
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\raguram.ramdoss\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));	
	
	driver.get("https://demo.nopcommerce.com/");

	
	}	
	
	
	

}

