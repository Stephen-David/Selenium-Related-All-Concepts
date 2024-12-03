package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
private WebDriver driver;
	
	public void setDriver(WebDriver driver) {
		driver=new ChromeDriver();
		this.driver = driver;
	}

	public WebDriver getDriver() {
		return driver;
	}

}
