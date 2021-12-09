package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tshirt_page {
	public WebDriver driver;
	
	@FindBy(xpath = "(//a[text()='T-shirts'])[2]")
	private WebElement Tshirt_page;

	public Tshirt_page(WebDriver driver2) {
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getTshirt_page() {
		return Tshirt_page;
	}
	

}
