package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtablehandling {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();//abstraction//overriding



		driver.manage().window().maximize();



		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));



		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");



		System.out.println(driver.getTitle());



		System.out.println(driver.getCurrentUrl());



		List<WebElement>tableHeadingRows = driver.findElements(By.xpath("/html/body/div[2]/div[4]/table/thead/tr"));



		for(int i=1;i<=tableHeadingRows.size();i++)

		{

			List<WebElement> tableHeadingColumn = driver.findElements(By.xpath("/html/body/div[2]/div[4]/table/thead/tr["+i+"]/th"));



			for(int j=1; j<=tableHeadingColumn.size();j++)

			{

				WebElement tableHeading = driver.findElement(By.xpath("/html/body/div[2]/div[4]/table/thead/tr["+i+"]/th["+j+"]"));

			

				System.out.print(tableHeading.getText()+"|");
//
//			
//
			//System.out.println();
			}}

		



		List<WebElement> tableBodyRows = driver.findElements(By.xpath("/html/body/div[2]/div[4]/table/tbody/tr"));



		for(int i=1;i<=tableBodyRows.size();i++)

		{

			List<WebElement> tableBodyColumn = driver.findElements(By.xpath("/html/body/div[2]/div[4]/table/tbody/tr["+i+"]/td"));



			for(int j=1; j<=tableBodyColumn.size();j++)

			{

				WebElement tableData = driver.findElement(By.xpath("/html/body/div[2]/div[4]/table/tbody/tr["+i+"]/td["+j+"]"));



				System.out.print(tableData.getText()+"|");

			}

			System.out.println();

	}

}}
