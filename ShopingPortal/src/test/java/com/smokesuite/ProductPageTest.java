package com.smokesuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Setup.TestBase;
import com.pages.HomePage;
import com.pages.ProductPage;

public class ProductPageTest extends TestBase
{
	HomePage homePage;
	ProductPage productPage;
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		homePage = new HomePage();
		naviagateToProductPage();
		
	}
	
	private void naviagateToProductPage() 
	{
      productPage= homePage.selectPintedDress();
		
	}
	@Test
	public void select_a_printed_dress_and_verify_its_inforamtion()
	{
	
	}
	
}
