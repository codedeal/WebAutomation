package Sel.Testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Setup.TestBase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestBase

{
public static WebDriver driver;
	
	@BeforeMethod
	public void SetUp()
	{
		initialization();
		//‎⁨Macintosh HD⁩ ▸ ⁨Users⁩ ▸ ⁨Upendra⁩ ▸ ⁨Documents⁩ ▸ ⁨Drivers
		/*System.setProperty("webdriver.chrome.driver", "/Users/Upendra/Documents/Drivers/chromedriver");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");*/
	}
	
	@Test
	public void Test1()
	{
		Assert.assertTrue(true);
	}
}
