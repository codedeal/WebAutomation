package com.smokesuite;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Setup.TestBase;
import com.pages.HomePage;
import com.pages.ProductPage;

public class HomePageTest extends TestBase
{
	    Logger logger = Logger.getLogger(HomePageTest.class);
		HomePage homePage;
		ProductPage productPage;
	
		@BeforeMethod
		public void setUp()
		{
			logger.info("setup");
			initialization();
			homePage = new HomePage();
			productPage = new ProductPage();
		}
		
		@Test(priority=3)
		public void verifyHomePageTitleTest(){
			String homePageTitle = homePage.verifyHomePageTitle();
			Assert.assertTrue(homePageTitle.contains("My Store"));
			
			
		}
		
		@Test(priority=2)
		public void when_we_hover_women_we_should_be_able_to_select_dress(){
			  logger.debug("beta....");
			  logger.info("som message");
		      productPage= homePage.selectItem("dress");
		      productPage.selectaDress();
			
		}
		
		@Test(priority=1)
		public void verifythemessageofCustomBlock()
		{   logger.debug("alpha....");
		   logger.info("som message");
			homePage.verifyMessage("Selenium Framework website was designed solely to help folks get over the fear of Automation. The website was an inspiration from the fact that there is no website that can bridge the gaps between the differences among various programming languages and help non-programmers get a taste of Automation.");
		}
		
		@AfterMethod
		public void tearDown(){
			driver.quit();
		}
}
