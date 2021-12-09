package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCart_Page {
	public WebDriver driver;

	@FindBy(xpath = "(//span[text()='Add to cart'])[1]")
	private  WebElement AddToCart_Page;

	public AddToCart_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddToCart_Page() {
		return AddToCart_Page;
	}
}
