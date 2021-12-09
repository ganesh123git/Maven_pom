package com.demo_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testrunner_demo extends Baes_class {
	public static WebDriver driver; // --->null
	
	public static void main(String[] args) {
		
		 driver = getBrowser("chrome");
		//getBrowser("chrome,firefox,ie");------->( base class)static varaiable ah koduthanala change panikalam
		
	//	driver.get("http://automationpractice.com/index.php");
		url("http://automationpractice.com/index.php");
		
		driver.manage().window().maximize();
		
		WebElement login = driver.findElement(By.xpath("//a[@class='login']"));
		//login.click();
		clickonElement(login);
		WebElement email = driver.findElement(By.name("email"));
		//email.sendKeys("ganeshkumar9416@gmail.com");
		inputValueElement(email, "ganeshkumar9416@gmail.com");
		WebElement passwd = driver.findElement(By.id("passwd"));
		//passwd.sendKeys("Ganesh@123");
		inputValueElement(passwd, "Ganesh@123");
		WebElement login_btn = driver.findElement(By.xpath("//i[@class='icon-lock left']"));
		//login_btn.click();
		clickonElement(login_btn); 
		close();
		
		
		
		
		
		
		
		
	}

}
