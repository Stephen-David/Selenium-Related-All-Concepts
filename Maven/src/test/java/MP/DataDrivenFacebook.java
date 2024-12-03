package MP;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenFacebook {
	WebDriver driver;

	@DataProvider(name="getData")
	public String[][] data()
	{
	String data[][]= {

	{"admin@mail.com","Admin@123"},
	{"tester@mail.com","Tester@123"},
	{"developer@mail.com","Developer@123"},

	};

	return data;
	}

	public void maximize()
	{
	driver.manage().window().maximize();
	}

	public void implictWait()
	{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@BeforeClass
	public void setUp()
	{
	driver=new ChromeDriver();
	maximize();
	implictWait();
	driver.get("https://www.facebook.com/");
	}


	@Test(dataProvider = "getData")
	public void verifyLogin(String userName,String passWord) throws InterruptedException
	{
	WebElement emailField = driver.findElement(By.id("email"));

	WebElement passwordField = driver.findElement(By.id("pass"));

	emailField.clear();
	passwordField.clear();
	Thread.sleep(2000);
	emailField.sendKeys(userName);
	passwordField.sendKeys(passWord);

	}
	@AfterClass
	public void m1(){
		driver.quit();
	}
	
	{
		
	}
	}


