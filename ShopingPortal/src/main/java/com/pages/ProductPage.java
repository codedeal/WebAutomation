package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Setup.TestBase;

public class ProductPage extends TestBase
{
	@FindBy(xpath="//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img")
	WebElement casualdress;
	
	@FindBy(xpath="//*[@title='Add to cart']")
	WebElement addToCart;
	
	public ProductPage() 
	{
		PageFactory.initElements(driver, this);
	
	}
	
	public void selectaDress()
	{
		scrollToelement(casualdress);
		hoverOverElement(casualdress);
		addToCart.click();
		
	}
}
