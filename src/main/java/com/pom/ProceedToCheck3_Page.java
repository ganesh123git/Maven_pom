package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProceedToCheck3_Page {

	public WebDriver driver;
	@FindBy(name = "cgv")
	private WebElement ProceedToCheck3_Page;

	public ProceedToCheck3_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getProceedToCheck3_Page() {
		return ProceedToCheck3_Page;
	}
}
