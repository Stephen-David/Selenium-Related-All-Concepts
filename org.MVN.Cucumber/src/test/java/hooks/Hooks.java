package hooks;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Base.Baseclass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.Status;

public class Hooks {
	WebDriver driver;

	Baseclass baseClass;

	public Hooks(Baseclass baseclass) {
		this.baseClass = baseclass;
	}

	@Before
	public void beforeScenario(Scenario scenario) {
		String id = scenario.getId();
		System.out.println(id);

		String name = scenario.getName();
		System.out.println(name);

		baseClass.setDriver(driver);
		driver = baseClass.getDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.facebook.com/");

	}

	@After
	public void afterScenario(Scenario scenario) {
		Status status = scenario.getStatus();
		System.out.println(status.name());

		boolean runStatus = scenario.isFailed();
		if (runStatus) {
			TakesScreenshot ts = (TakesScreenshot) driver;
			String screenshotAs = ts.getScreenshotAs(OutputType.BASE64);

			scenario.attach(screenshotAs, "image/png", "screenshot captured..");
		}

		driver.close();
	}

}
