package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.CucumberOptions.SnippetType;

public class LoginRun {
	@CucumberOptions(
			features = ".\\src\\test\\resources\\features",
			snippets = SnippetType.CAMELCASE,
			glue = {"steps","hooks"},
			dryRun = !true,
			tags = "@smoke or @regression or @sanity",
			plugin = {
					"pretty",
					"html:.\\src\\test\\resources\\Reports\\index.html",
					"json:.\\src\\test\\resources\\Reports\\index.json",
					"junit:.\\src\\test\\resources\\Reports\\index.xml",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
			}
			)
	
	
	
	public class Loginrun extends AbstractTestNGCucumberTests{



	}

}
