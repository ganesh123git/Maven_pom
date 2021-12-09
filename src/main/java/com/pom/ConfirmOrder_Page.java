package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmOrder_Page {

	public WebDriver driver;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
 private	WebElement ConfirmOrder_Page;

	public ConfirmOrder_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getConfirmOrder_Page() {
		return ConfirmOrder_Page;
	}
	
}
