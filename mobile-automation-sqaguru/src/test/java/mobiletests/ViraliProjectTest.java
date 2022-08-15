package mobiletests;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.MobileElement;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ViraliProjectTest {
	AppiumDriver<MobileElement> driver;

	@Test
	public void firstTest() throws MalformedURLException, InterruptedException {

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
		WebDriver driver = new AppiumDriver<MobileElement>(url, desiredCapabilities);
		driver.get("http://www.google.com/");
		driver.findElement(By.xpath("//*[text()='Sign in']")).isDisplayed();
		// driver.findElement(By.xpath("//*[text()='Sign in']")).click();

		driver.findElement(By.name("q")).sendKeys("Moblie Automation");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).click();
		Thread.sleep(2000);
		// driver.findElement(By.name("Search…")).click();
		// driver.findElement(By.xpath("//automation test[@index='0']"));
		// driver.findElement(By.className("android.widget.RelativeLayout")).click();

		// driver.findElement(By.xpath("//input[@id='email']")).sendKeys("7879550507");
		// driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Mansi@123");
		// String title = driver.getTitle();
		// System.out.println("title: " + title);

		driver.close();
		driver.quit();

	}

}
