package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https:/facebook.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement type=driver.findElement(By.name("email"));
		type.sendKeys("qwerty123@gmail.com");
		WebElement type1=driver.findElement(By.name("pass"));
		type1.sendKeys("123456");
		WebElement login=driver.findElement(By.name("login"));
		login.click();
		
		
		
	}

}
