package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayCheck_Page {

	public WebDriver driver;
	
@FindBy(xpath = "//a[@title='Pay by check.']")
private WebElement PayCheck_Page;

public PayCheck_Page(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver, this);
}

public WebElement getPayCheck_Page() {
	return PayCheck_Page;
}
}
