package demo;
import io.appium.java_client.android.AndroidDriver;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
public class StartApplication {                            
	private static AndroidDriver driver;
	public static void main(String[] args) throws MalformedURLException, InterruptedException 
	{	                         
	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("platformName", "Android");
	capabilities.setCapability("platformVersion", "11 RP1A.200720.011");
	capabilities.setCapability("deviceName", "POCO M4 Pro");
	capabilities.setCapability("appPackage", "io.selendroid.testapp");
	capabilities.setCapability("appActivity", ".HomeScreenActivity");
	capabilities.setCapability("browserName", "");
	driver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"), capabilities);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//android.widget.EditText[@content-desc='my_text_fieldCD']")).sendKeys("Virali Selenium Appium");
	driver.findElement(By.id("io.selendroid.testapp:id/startUserRegistration")).click();
	driver.findElement(By.id("io.selendroid.testapp:id/inputUsername")).sendKeys("Test");
	driver.findElement(By.id("io.selendroid.testapp:id/inputEmail")).sendKeys("test@gmail.com");
	driver.findElement(By.id("io.selendroid.testapp:id/inputPassword")).sendKeys("test@123");
	driver.findElement(By.id("io.selendroid.testapp:id/inputName")).sendKeys(" ");
	driver.findElement(By.id("android:id/text1")).click();
	driver.findElement(By.id("io.selendroid.testapp:id/input_adds")).click();
	driver.findElement(By.id("io.selendroid.testapp:id/btnRegisterUser")).click();
	System.out.println("Test case is Pass...");
	driver.quit();
	}
}

