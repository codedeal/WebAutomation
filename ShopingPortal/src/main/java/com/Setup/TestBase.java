package com.Setup;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeSuite;

import com.logger.Log;
import com.smokesuite.HomePageTest;

public class TestBase 
{
	public static WebDriver driver;
	public static Properties prop;
	Logger logger = Logger.getLogger(TestBase.class);

	public static WebDriver getDriver()
	{
		if(driver==null)
			initialization();
		return driver;
	}
	
	public TestBase(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/config/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void initialization(){
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "/Users/Upendra/Documents/Drivers/chromedriver");
			driver = new ChromeDriver(); 
			Log.info("chrome driver created");
		}
		else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "Users⁩/⁨Upendra⁩/⁨Documents⁩/⁨Drivers⁩/chromedriver/geckodriver");	
			driver = new FirefoxDriver(); 
			Log.info("firefox driver created");
		}
		
		
	
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(prop.getProperty("url"));
		
	}
	
	public void selectItemFromMenu(WebElement element1, WebElement element2)
	{
		Actions builder = new Actions(driver);
		// Move cursor to the Main Menu Element
		builder.moveToElement(element1).perform();
		element2.click();
	}
	public void hoverOverElement(WebElement element)
	{
		Actions builder = new Actions(driver);
		builder.moveToElement(element).build().perform();
	}
	public void scrollToelement(WebElement element)
	{
		
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}
}
