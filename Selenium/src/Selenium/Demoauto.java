package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demoauto {

	@Test
	public void m1(){
		WebDriver driver=new ChromeDriver();//abstraction//overriding

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

		driver.get("https://www.google.co.in/");

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());

		WebElement searchbar = driver.findElement(By.name("q"));

		searchbar.sendKeys("infomats");

	List<WebElement> list = driver.findElements(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div/ul/li"));

	System.out.println(list.size());

		for(WebElement aa:list)
		{
		System.out.println(aa.getText());
		}

		for(WebElement aa:list)
		{
		if(aa.getText().endsWith("salem"))
		{
		aa.click();
		break;
	}

}}}
