package com.demo_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Baes_class {
	
	public static WebDriver driver; //------> null
	
	public static WebDriver getBrowser(String type) {
		//if(type=chrome)// equals ignorecase--->upper and lower iruntha consider panikum
		if (type.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.driver.chromedriver",
					System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
						
		 driver = new ChromeDriver();
			
		}
		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.driver.geckodriver",
					System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
						
			 driver = new FirefoxDriver();
		}

		driver.manage().window().maximize();
		return driver;	//   void to change --->webdriver in getbrowser method
		
	}
	
	

public static void clickonElement(WebElement element) {
		
 //   System.out.println("webelement" + element.toupper or lowercase kodukalam );
	element.click();
	
	}

public static void inputValueElement(WebElement element, String value) {
	element.sendKeys(value);

}

//public static void gettext(WebElement element) {
//	element.getText();  // runner class la syso(element.gettext());-->kodukalam
//
//}

public static void url(String url) {
	driver.get(null);

}

public static void close() {
	driver.close();
}
private void quit() {
	driver.quit();

}







}
