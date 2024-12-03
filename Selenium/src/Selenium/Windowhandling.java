package Selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();//abstraction//overriding
        driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));



		driver.get("https://www.facebook.com/");



		System.out.println(driver.getTitle());



		System.out.println(driver.getCurrentUrl());

		

		driver.switchTo().newWindow(WindowType.WINDOW).get("https://www.instagram.com/");

		

		System.out.println(driver.getTitle());



		System.out.println(driver.getCurrentUrl());

		

		WebElement userNameFieldInstagram = driver.findElement(By.name("username"));

		

		userNameFieldInstagram.sendKeys("admin@mail.com");

		

		Set<String> windows = driver.getWindowHandles();

		

		System.out.println(windows.size());//2 0 1

		

      ArrayList<String> list=new ArrayList<String>(windows);
//
//		
//
	  driver.switchTo().window(list.get(0));
//
//		
//
		WebElement createButton = driver.findElement(By.partialLinkText("Cre"));

		
		createButton.click();
//
//		
//
		driver.switchTo().window(list.get(1));
//
//		
//
		//driver.close();
//
//		
//
//		driver.switchTo().window(list.get(0));
//
//		
//
		WebElement firstnameField = driver.findElement(By.name("login"));
//
//		
//
		firstnameField.click();
		
		
//
//		
	}

}
