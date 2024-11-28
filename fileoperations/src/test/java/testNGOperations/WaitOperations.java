package testNGOperations;

import java.sql.Driver;
import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitOperations {
	
	WebDriver driver;
	@SuppressWarnings("deprecation")
	@Test
	public void sleepoperations() throws InterruptedException
	{
		
		//Sleep
Thread.sleep(5000);
//ImplicitlyWait
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
//ExplicitWait
WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

WebElement user = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("")));

user.click();

user.getScreenshotAs(OutputType.FILE);

//Implicit Wait

Wait<WebDriver> wait2 = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(50)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);

  WebElement userd = wait2.until(new Function<WebDriver, WebElement>() {

	
	public WebElement apply(WebDriver driver) {
		// TODO Auto-generated method stub
		return driver.findElement(By.xpath(""));
	} 


}

)	;

}
	
}
