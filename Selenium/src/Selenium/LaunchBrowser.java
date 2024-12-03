package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

	public static void main(String[] args)throws InterruptedException{
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.youtube.com/");
	Thread.sleep(2000);
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	driver.navigate().to("https://www.instagram.com/");
	driver.navigate().back();
	Thread.sleep(5000);
	driver.navigate().refresh();
	driver.close();
	driver.quit();
	
	}

}
