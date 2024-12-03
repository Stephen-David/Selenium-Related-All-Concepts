package Selenium;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AbsoluteXpath {
	@Test
	public static void m1(){
		


	
		WebDriver driver=new ChromeDriver();//abstraction//overriding



		driver.manage().window().maximize();

		

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));



		driver.get("https://www.instagram.com/");



		System.out.println(driver.getTitle());



		System.out.println(driver.getCurrentUrl());

		

		WebElement
		createNewButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a"));

		

		createNewButton.click();

		

//		WebElement firstNameField = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/input"));
//
//		
//
//		firstNameField.sendKeys("admin");
//
//		
//
//		WebElement maleRadioButton = Driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div[2]/div/div/div[1]/form/div[1]/div[7]/span/span[2]/input"));
//
//		
//
//		maleRadioButton.click();
//
//		
//
//	}


	}}


	


