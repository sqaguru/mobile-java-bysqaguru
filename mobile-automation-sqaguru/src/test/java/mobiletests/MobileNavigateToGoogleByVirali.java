package mobiletests;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.MobileElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;
public class MobileNavigateToGoogleByVirali {
	AppiumDriver<MobileElement> driver;
	@Test
	public void Test1(){
		try {
		DesiredCapabilities DesiredCapabilities  = new DesiredCapabilities();
		DesiredCapabilities .setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		DesiredCapabilities .setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0 OPM1.171019.026");
		DesiredCapabilities .setCapability("appium:deviceName", "Redmi");
		DesiredCapabilities .setCapability(MobileCapabilityType.UDID, "226797ee7d15");
		DesiredCapabilities .setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
		DesiredCapabilities .setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		// caps.setCapability(MobileCapabilityType.APP,"");
		DesiredCapabilities .setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		WebDriver driver = new AppiumDriver<MobileElement>(url,DesiredCapabilities );
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("http://www.google.com/");
		//driver.findElement(By.name("q")).sendKeys("mobile automation");
		/*
		 * driver.findElement(By.name("q")).sendKeys("mobile testing");
		 * driver.findElement(By.name("q")).click();
		 */
		String title = driver.getTitle();
		System.out.println("title: " + title);
		}catch(Exception exp){
			exp.printStackTrace();
		}
	}
		
}


