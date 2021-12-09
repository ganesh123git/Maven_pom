package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProceedToCheck2_Page {
	public WebDriver driver;

	@FindBy(name = "processAddress")
	private WebElement ProceedToCheck2_Page;

	public ProceedToCheck2_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getProceedToCheck2_Page() {
		return ProceedToCheck2_Page;
	}
}
