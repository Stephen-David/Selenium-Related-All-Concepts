package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorSet {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();//abstraction//overriding

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		WebElement emailField = driver.findElement(By.id("email"));

		WebElement passwordField = driver.findElement(By.id("pass"));

		WebElement loginButton = driver.findElement(By.name("login"));

		emailField.sendKeys("admin@mail.com");

		passwordField.sendKeys("admin@123");

		//emailField.clear();

    	//passwordField.clear();
//
//		emailField.sendKeys("logeshwaran.bvn24@gmail.com");
//
//		passwordField.sendKeys("tester@123");
//		
	loginButton.click();

	}

}
