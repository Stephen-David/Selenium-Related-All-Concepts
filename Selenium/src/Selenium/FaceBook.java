package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FaceBook {
WebDriver driver;
@BeforeMethod
public void browser(){
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https:/facebook.com/");
	
}
@Test(groups = "smoke")
public void verify() {
	WebElement email=driver.findElement(By.id("email"));
	WebElement pass=driver.findElement(By.id("pass"));
	email.sendKeys("admin@123");
	pass.sendKeys("admin@123");
}
@Test
public void verified(){
	WebElement email=driver.findElement(By.id("email"));
	email.clear();
	WebElement pass=driver.findElement(By.id("pass"));
	pass.clear();
	
}

@AfterMethod(enabled = false)
public void done() {
	driver.quit();
	
	
}

}
