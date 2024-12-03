package Selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framehandling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();//abstraction//overriding



		driver.manage().window().maximize();



		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));



		driver.get("https://www.google.co.in/");



		System.out.println(driver.getTitle());



		System.out.println(driver.getCurrentUrl());



		//driver.switchTo().frame(0);//index



		//driver.switchTo().frame("callout");//nameorid



		WebElement frame = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div/div/div/div[3]/iframe"));



		driver.switchTo().frame(frame);//webelement



		WebElement signinButton = driver.findElement(By.xpath("/html/body/div/c-wiz/div/div/c-wiz/div/div/div/div[2]/div[2]/a"));



		signinButton.click();



         Set<String> windows = driver.getWindowHandles();
//
//
//
//		System.out.println(windows.size());//2 0 1
//
//
//
		ArrayList<String> list=new ArrayList<String>(windows);
//
//
//
		driver.switchTo().window(list.get(0));
//
//		
//
//		driver.close();
//
//		
//
		//driver.switchTo().window(list.get(0));
//
//		
//
	//	driver.switchTo().defaultContent();//leave frame
//
//		
//
//		//WebElement searchbar = driver.findElement(By.name("q"));
//
//		
//
//		//searchbar.sendKeys("infomats");

//		
//
	}



	}


