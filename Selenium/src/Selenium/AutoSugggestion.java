package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSugggestion {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		WebElement searchbox=driver.findElement(By.xpath("/html/body/ytd-app/div[1]/div/ytd-masthead/div[4]/div[2]/ytd-searchbox/form/div[1]/div[1]/input"));
		searchbox.sendKeys("song");
		//List<WebElement> suggestionbox=driver.findElements(By.xpath("/html/body/div[1]/div[7]/div/div/div[1]/div/div/div[2]/div[1]/ul/li[1]/div"));
		//System.out.println(suggestionbox.size());
	//	for(WebElement aa:suggestionbox) 
	//	{
		//System.out.println(aa.getText());	
			
			
		}
		//for(WebElement aa:suggestionbox) {
			//if(aa.getText().endsWith("script")) {
				//aa.click();
				
				
			}
			
		//}

	//}

//}
