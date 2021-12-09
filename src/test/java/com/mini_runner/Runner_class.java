package com.mini_runner;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.pom.ImgView_Page;
import com.pom.AddToCart_Page;
import com.pom.ConfirmOrder_Page;
import com.pom.Frame_Page;
import com.pom.Home_Page;
import com.pom.Login_Page;
import com.pom.PayCheck_Page;
import com.pom.ProceedToCart_Page;
import com.pom.ProceedToCheck2_Page;
import com.pom.ProceedToCheck3_Page;
import com.pom.ProceedToCheck4_Page;
import com.pom.ProceedToCheckout1_Page;
import com.pom.Tshirt_page;

public class Runner_class extends Base_class {
	public static WebDriver driver = getBrowser("chrome");
	public static Home_Page hp = new Home_Page(driver); //hp.login();
	public static Login_Page login = new Login_Page(driver);
	public static Tshirt_page t = new Tshirt_page(driver);
	public static ImgView_Page ad = new ImgView_Page(driver);
	public static Frame_Page fb = new Frame_Page(driver);
	public static AddToCart_Page ap = new AddToCart_Page(driver);	
	public static ProceedToCart_Page pc = new ProceedToCart_Page(driver);
	public static ProceedToCheckout1_Page pc1 = new ProceedToCheckout1_Page(driver);
	public static ProceedToCheck2_Page pc2 = new ProceedToCheck2_Page(driver);
	public static ProceedToCheck3_Page pc3 = new ProceedToCheck3_Page(driver);
	public static ProceedToCheck4_Page pc4 = new ProceedToCheck4_Page(driver);
	public static PayCheck_Page pc5 = new PayCheck_Page(driver);
	public static ConfirmOrder_Page cp = new ConfirmOrder_Page(driver);
	
  public static void main(String[] args) throws Throwable {
		
		url("http://automationpractice.com/index.php");
		implicitwait(5000, TimeUnit.SECONDS);

		clickOnElement(hp.getLogin());
        inputValueElement(login.getEmail(), "ganeshkumar9416@gmail.com");
		inputValueElement(login.getPassword(), "Ganesh@123");
		clickOnElement(login.getSignin());
		clickOnElement(t.getTshirt_page());
		executescript(0, 800);
		sleep(4000);
		clickOnElement(ad.getImgView_Page());
		driver.switchTo().frame(fb.getFrame_Page());
		sleep(4000);
		clickOnElement(ap.getAddToCart_Page());
		driver.switchTo().defaultContent();
		sleep(4000);
		clickOnElement(pc.getProceedToCart_Page());
		clickOnElement(pc1.getProceedToCheckout1_Page());
		clickOnElement(pc2.getProceedToCheck2_Page());
		clickOnElement(pc3.getProceedToCheck3_Page());
		clickOnElement(pc4.getProceedToCheck4_Page());
		clickOnElement(pc5.getPayCheck_Page());
		clickOnElement(cp.getConfirmOrder_Page());
		executescript(0, 500);
		
		TakesScreenshot ts = (TakesScreenshot) driver;	
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Ganesh\\eclipse-workspace\\Mini_Project_Selenium\\screenshot\\shot1.png");
		FileUtils.copyFile(source, destination);
			//close();
		
		//quit();
		
		
		
	}
	
}

