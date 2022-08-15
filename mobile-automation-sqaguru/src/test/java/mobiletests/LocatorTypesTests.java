package mobiletests;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LocatorTypesTests {
	@Test
	public void test1() throws MalformedURLException, InterruptedException {
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
		desiredCapabilities.setCapability("chromeOptions", ImmutableMap.of("w3c", false));
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		// WebDriver driver = new AppiumDriver<MobileElement>(url, desiredCapabilities);
		WebDriver driver = new AppiumDriver<MobileElement>(url, desiredCapabilities);
		// AndroidDriver driver = new AndroidDriver(url, desiredCapabilities);
		driver.get("http://www.google.com/");

		driver.findElement(By.xpath("//*[text()='Sign in']")).isDisplayed();
		// driver.findElement(By.xpath("//android.widget.TextView[@index='0']")).isDisplayed();
		// driver.findElementByXPath("//android.widget.TextView[@index='0']").isDisplayed();
		// driver.findElementByClassName("android.widget.EditText").sendKeys("mobile
		// automation");

		// driver.findElement(By.name("Google Search")).sendKeys("Automation testing");
		// driver.findElement(By.xpath("//android.widget.EditText[@index='0']")).isDisplayed();
		driver.findElement(By.name("q")).sendKeys("Moblie Automation");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

		String searchResultTitle = driver.getTitle();
		System.out.println("Search result title: " + searchResultTitle);

		String title = driver.getTitle();
		System.out.println("title: " + title);
	}
}
