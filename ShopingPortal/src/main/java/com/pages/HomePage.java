package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.Setup.TestBase;

public class HomePage extends TestBase
{
	@FindBy(xpath = "//*[@id='block_top_menu']/ul/li[1]/a")
	WebElement women;
	
	@FindBy(xpath="//*[@id='block_top_menu']/ul/li[1]/ul/li[2]/ul/li[1]/a")
	WebElement women_dress;
	
	@FindBy(xpath="//*[@id='cmsinfo_block']/div[2]/p[2]")
	WebElement custom_info_block;
	
	@FindBy(xpath="//a[text()='Printed Dress']")
	WebElement printed_dress;
	
	public HomePage() 
	{
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle()
	{
		return driver.getTitle();
	}
	
	public ProductPage selectItem(String ItemName)
	{
		selectItemFromMenu(women, women_dress); 
		return new ProductPage();
	}
    
	public void verifyMessage(String message)
	{
		scrollToelement(custom_info_block);
		Assert.assertEquals(custom_info_block.getText(), message);
	}
	
	public ProductPage selectPintedDress()
	{
		if(!printed_dress.isDisplayed())
			scrollToelement(printed_dress);
		printed_dress.click();
		return new ProductPage();
	}
}
