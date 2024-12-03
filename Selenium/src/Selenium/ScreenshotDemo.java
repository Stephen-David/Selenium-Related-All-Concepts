package Selenium;

import java.io.File;
import java.nio.file.CopyOption;
import java.time.Duration;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScreenshotDemo {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.facebook.com/");
	WebElement ss=driver.findElement(By.id("email"));
	TakesScreenshot ts=(TakesScreenshot)driver;
	File screenCaptured=ts.getScreenshotAs(OutputType.FILE);
	File topath=new File("C:\\Users\\STEPHEN\\OneDrive\\Pictures\\Screenshots"+System.currentTimeMillis()+".png");
  

	}

}
