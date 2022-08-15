package mobiletests;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class FirstTestSantoshMobile {
	@Test
	public void test1() throws MalformedURLException {
		DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

		desiredCapabilities.setCapability("chromedriverExecutable",
				"D:\\sqa-guru\\charan\\charan-automation\\CharanAutomation\\resources\\drivers\\chromedriver.exe");

		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
		desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "bhingesantosh");
		desiredCapabilities.setCapability(MobileCapabilityType.UDID, "EUKNAQI7HYMR6D9D");
		desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		desiredCapabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);
		desiredCapabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");

		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		WebDriver driver = new AppiumDriver<MobileElement>(url, desiredCapabilities);
		driver.get("http://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("mobile automation");
		driver.findElement(By.name("q")).submit();
		String title = driver.getTitle();
		System.out.println("title: " + title);
	}
}
