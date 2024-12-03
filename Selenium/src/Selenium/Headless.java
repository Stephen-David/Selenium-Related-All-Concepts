package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless {

	public static void main(String[] args) {

ChromeOptions opt = new ChromeOptions();
opt.addArguments("--start-maximized");
WebDriver driver = new ChromeDriver(opt);
//driver.manage().window().maximize();
driver.get("https://www.instagram.com/");
System.out.println(driver.getCurrentUrl());

	}

}
