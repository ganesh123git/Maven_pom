package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProceedToCheck4_Page {
	public WebDriver driver;

	@FindBy(name = "processCarrier")
	private WebElement ProceedToCheck4_Page;

	public ProceedToCheck4_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getProceedToCheck4_Page() {
		return ProceedToCheck4_Page;
	}
}
