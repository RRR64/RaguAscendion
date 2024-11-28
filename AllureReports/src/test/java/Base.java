import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Base {
	
	 
	
	
	public WebDriver driver;
	 
	public static ThreadLocal<WebDriver> th = new ThreadLocal<WebDriver>();
		
	public   WebDriver start()
	{
	
			
			
			 driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));	
	
				
		
		
		th.set(driver);

		return getDriver();
		}

		public synchronized static WebDriver  getDriver() {
			// TODO Auto-generated method stub
			return th.get();
		}	


}
