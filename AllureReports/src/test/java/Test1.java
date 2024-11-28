import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners({LiUser.class})
public class Test1 extends Base {
	
	public WebDriver driver;
	
			
	@Test
	public void testuser() throws InterruptedException
	
	{
		Base be = new Base();
		
						
		this.driver=be.start();
						
		driver.get("https://demo.nopcommerce.com/");
				
			WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
			
			Assert.assertEquals(logo.isDisplayed(), false);
	}

}
