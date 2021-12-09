package com.mini_runner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_class {
	
	public static  WebDriver driver;   //  driver---> null
	
	public static WebDriver getBrowser(String type) {
		
		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", 
					System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
			 driver = new ChromeDriver();
		}
		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", 
					System.getProperty("user.dir")+"\\Driver\\geckodriver.exe");
		
			 driver = new FirefoxDriver();
		
		}
		
		driver.manage().window().maximize();
		return driver;	
		
	}
	public static void url (String url) {
		driver.get(url);
		
	}
	public static void clickOnElement(WebElement element) {
		element.click();
	}
    public static void inputValueElement(WebElement element,String value) {	
    	element.sendKeys(value);
    	
}
   public static void quit() {
   	driver.quit();
    	
   }
    public static void sleep(int seconds) throws Throwable {
    	Thread.sleep(seconds);

	} 
    public static void close() {
    	driver.close();
    }
     
    public static void  executescript(int value, int range) {
    	
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	
	}
    
public static   void implicitwait(int seconds, TimeUnit format) {
	driver.manage().timeouts().implicitlyWait(seconds, format);

}    
    
    
	}


