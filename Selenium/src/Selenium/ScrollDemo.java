package Selenium;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDemo {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();//abstraction//overriding

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.facebook.com/legal/terms/update");

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,document.body.scrollheight");
		
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		
	}



	}


