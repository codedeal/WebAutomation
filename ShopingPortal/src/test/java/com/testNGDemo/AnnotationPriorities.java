package com.testNGDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationPriorities 
{
	//pre condition --- starts wih Before or steps to take prior to exection of each test case
   @BeforeSuite //1 ...
   public void SuiteSetup()
   {
	   System.out.println("Suite SetUP");
   }
   
   @BeforeTest //2 ..
   public void launchBrowser()
   {
	   System.out.println("We launch browser");
   }
   @BeforeClass //3..
   public void login()
   {
	   System.out.println("login to the app");
   }
   
   @BeforeMethod //4..
   public void enterURL()
   {
	   System.out.println("enter the url");
   }
   
   @Test // 5..
   public void googleTest()
   {
	   System.out.println("test something on the google");
	   
   }
   
   @Test // 5..
   public void googlesearchTest()
   {
	   System.out.println("search something on the google");
	   
   }
   @AfterMethod
   public void logout()
   {
	   System.out.println("logout from google");
	   
   }
   @AfterTest
   public  void deleteAllCookies()
   {
	   System.out.println("deleted all cookies");
   }
   
   @AfterClass
   public void closeBrowser()
   {
	   System.out.println("close the browser after each TC");
   }
   
   @AfterSuite
   public void generateTestReport()
   {
	   System.out.println("generate test report");
   }
   
   
}
