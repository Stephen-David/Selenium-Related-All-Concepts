package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollView {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();//abstraction//overriding

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.facebook.com/legal/terms/update");

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());
		WebElement view=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div/div[2]/div[2]/div[2]/h3"));
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",view);
		
		
		
		
	}



	}


