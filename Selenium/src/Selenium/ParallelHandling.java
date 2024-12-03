package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelHandling {
	@Test
	public void m1() {
		System.out.println("paralle1--->"+Thread.currentThread().getId());
	
	WebDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	driver.manage().window().maximize();
	WebElement alt=driver.findElement(By.name("proceed"));
	alt.click();
	Alert alert=driver.switchTo().alert();
	
	alert.accept();
	


	
 
	}

	@Test
public void m2() {
	System.out.println("parallel2------>"+Thread.currentThread().getId());
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

}}
	@Test
	public void m3() {
		System.out.println("parallel3---->"+Thread.currentThread().getId());
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
	

