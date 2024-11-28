/*package testNGOperations;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import io.qameta.allure.Attachment;

public class LiClass implements ITestListener {
	

	@Attachment()
	public byte[] FailureScreenshot(WebDriver driver)
	
	{
	
		return (((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES));
	}
	
	@Attachment(value= "{0}",type="plain\text")
	
	public String setmessage(String message)
	{
		return message;
	}
	
	
	
	  public void onStart(ITestContext context) {
		  
		System.out.println("On Start will print"+  context.getCurrentXmlTest().getName());
		   
	  }

	  public void onFinish(ITestContext context) {
	   
		  System.out.println("On Finish will print"+  context.getCurrentXmlTest().getName());
			
		  
	  }


	
		  public void onTestSuccess(ITestResult result) {
			  
			  System.out.println("On Success will print"+ result.getMethod().getConstructorOrMethod().getName());
				 
		   
		  }

		  public void onTestFailure(ITestResult result) {
			  
			  System.out.println("On Failure will print"+ result.getThrowable().getMessage());
			  
			  FailureScreenshot(driver);
			  
			  setmessage(" Test Script Error Message is " + result.getThrowable().getMessage());
				
		  
		  }

		  public void onTestSkipped(ITestResult result) {
			  
			  System.out.println("On Skipped will print"+ result.getThrowable().getMessage());
				
		  
		  }

		 
			
	
	



}
*/