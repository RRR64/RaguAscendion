package launchDevice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileCommand;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class Startlaunch {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		DesiredCapabilities dp = new DesiredCapabilities();
		
		dp.setCapability(MobileCapabilityType.DEVICE_NAME, "");
		
		dp.setCapability(MobileCapabilityType.APP, "");
		
		AndroidDriver<WebElement> ad = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), dp);
		
		
		
	}

}
