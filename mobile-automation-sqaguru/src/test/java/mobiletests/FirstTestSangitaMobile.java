package mobiletests;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class FirstTestSangitaMobile {
	@Test
	public void test1() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");

		desiredCapabilities.setCapability("chromedriverExecutable",
				"D:\\sqa-guru\\charan\\charan-automation\\CharanAutomation\\resources\\drivers\\chromedriver.exe");

		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
		desiredCapabilities.setCapability("appium:deviceName", "sangitabhinge");
		desiredCapabilities.setCapability(MobileCapabilityType.UDID, "RZ8N71ARSEW");
		desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		WebDriver driver = new AppiumDriver<MobileElement>(url, desiredCapabilities);
		//AndroidDriver driver = new AndroidDriver(url, desiredCapabilities);
		driver.get("http://www.facebook.com/");
		
		//driver.findElement(By.xpath("//*[text()='Sign in']")).isDisplayed();
		//driver.findElementByClassName("android.widget.EditText").sendKeys("mobile automation");
		
		/*
		 * driver.findElement(By.className("android.widget.EditText")).
		 * sendKeys("mobile automation"); driver.findElement(By.name("q")).click();
		 */

		String title = driver.getTitle();
		System.out.println("title: " + title);
	}
}
