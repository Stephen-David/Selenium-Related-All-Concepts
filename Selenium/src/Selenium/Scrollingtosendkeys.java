package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollingtosendkeys {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();//abstraction//overriding

         driver.manage().window().maximize();

		

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));



		driver.get("https://www.facebook.com");



		System.out.println(driver.getTitle());



		System.out.println(driver.getCurrentUrl());

		

		WebElement emailField = driver.findElement(By.id("email"));

		

		JavascriptExecutor js=(JavascriptExecutor)driver;

		

		js.executeScript("arguments[0].value=('admin@mail.com');",emailField);
		Thread.sleep(3000);

		

		js.executeScript("arguments[0].value='';",emailField);

	
		
		
	}



	}


