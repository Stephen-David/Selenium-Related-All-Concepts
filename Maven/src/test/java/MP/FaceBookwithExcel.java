package MP;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FaceBookwithExcel {
	WebDriver driver;
	
	String file="‪C:/Users/STEPHEN/OneDrive/Desktop/stephen.xlsx";

	@DataProvider(name = "data")
	public String[][] data() throws IOException {
		EntireDatawithArray excel = new EntireDatawithArray();
		return excel.getEntireDataStrings(file, "Sheet1");
	}

	public void maximize() {
		driver.manage().window().maximize();
	}

	public void implictWait() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@BeforeClass
	public void setUp() {
		driver = new ChromeDriver();
		maximize();
		implictWait();
		driver.get("https://www.facebook.com/");

	}

	@Test(dataProvider = "data")
	public void verifyLogin(String userName, String passWord) throws InterruptedException {
		WebElement emailField = driver.findElement(By.id("email"));

		WebElement passwordField = driver.findElement(By.id("pass"));

		emailField.clear();
		passwordField.clear();

		emailField.sendKeys(userName);
		passwordField.sendKeys(passWord);
	}
	
}
