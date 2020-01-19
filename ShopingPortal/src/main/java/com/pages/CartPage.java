package com.pages;

import org.openqa.selenium.support.PageFactory;

import com.Setup.TestBase;

public class CartPage extends TestBase
{
	public CartPage() {
		PageFactory.initElements(driver, this);
	
	}
}
