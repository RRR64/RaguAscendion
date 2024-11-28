package testNGOperations;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BaseClass {
	
	static ThreadLocal<WebDriver> th;
	
		@Test
		public static WebDriver setup()
		{
		
			 th = new ThreadLocal<WebDriver>();
			
			
				WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));	
		
		driver.get("https://demo.nopcommerce.com/");
		
		th.set(driver);

		return getDriver();
		}

		public synchronized static WebDriver  getDriver() {
			// TODO Auto-generated method stub
			return th.get();
		}	
		
		
		
		
		

	}




