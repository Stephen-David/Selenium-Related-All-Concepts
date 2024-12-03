package steps;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.Baseclass;
import io.cucumber.java.en.When;

public class LoginSteps {
List<WebElement> links;
	
	WebDriver driver;
	
	Baseclass baseClass;
	
	public LoginSteps(Baseclass baseClass) {
		this.baseClass=baseClass;
	}

	@When("User Clicks the login button")
	public void userClicksTheLoginButton() {
		baseClass.getDriver().findElement(By.name("login")).click();
	}

	@When("user enters user name as {string}")
	public void userEntersUserNameAs(String userName) {
		baseClass.getDriver().findElement(By.id("email")).sendKeys(userName);
	}

	@When("user enters password as {string}")
	public void userEntersPasswordAs(String passWord) {
		baseClass.getDriver().findElement(By.id("pass")).sendKeys(passWord);
	}

	@When("User wants to get all the links in the webpage")
	public void userWantsToGetAllTheLinksInTheWebpage() {
		links = baseClass.getDriver().findElements(By.tagName("a"));
	}

	@When("User gets links count")
	public void userGetsLinksCount() {
		int linksSize = links.size();
		System.out.println("Overall Links Count in the Login Page of Facebook :: "+linksSize);
	}

	@When("User gets each links href attribute and text")
	public void userGetsEachLinksHrefAttributeAndText() {
		for (WebElement aa : links) {
			System.out.println(aa.getText()+"--->"+aa.getAttribute("href"));
		}
	}

}
