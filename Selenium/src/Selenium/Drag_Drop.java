package Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();//abstraction//overriding

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

		driver.get("https://jqueryui.com/droppable/");

		System.out.println(driver.getTitle());

		System.out.println(driver.getCurrentUrl());
		
		Actions act=new Actions(driver);
		
		driver.switchTo().frame(0);
//		
		WebElement from = driver.findElement(By.cssSelector("div#draggable"));
//		
		WebElement to = driver.findElement(By.cssSelector("div#droppable"));
//		
		act.dragAndDrop(from, to).perform();
//		
//		driver.switchTo().defaultContent();
		

	}

}
