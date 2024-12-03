package com.pom.PageObjects;

import org.openqa.selenium.By;

import com.pom.TestBase.BaseClass;
import com.pom.TestUtility.DriverHelper;

public class RegisterPage extends BaseClass{

	private By firstNameField=By.name("firstname");
	
	private By surNameField=By.name("lastname");
	
	private By mobileNumberField=By.xpath("//input[starts-with(@name,'reg_email')]");
	
	private By passwordField=By.xpath("//input[starts-with(@type,'reg_passwd')]");
	
	public void createNewAccount(String firstName,String lastName,String emailOrMobileNum,String password)
	{
		enterFirstNameField(firstName);
		
		enterSurNameField(lastName);
		
		enterMobileNumberField(emailOrMobileNum);
		
		enterPasswordField(password);
	}
	
	
	public void enterFirstNameField(String firstName)
	{
		DriverHelper.sendKeys(firstNameField,firstName);
	}
	
	public void enterSurNameField(String lastName)
	{
		DriverHelper.sendKeys(surNameField,lastName);
	}
	
	public void enterMobileNumberField(String emailOrMobileNum)
	{
		DriverHelper.sendKeys(mobileNumberField,emailOrMobileNum);
	}
	
	public void enterPasswordField(String password)
	{
		DriverHelper.sendKeys(passwordField,password);
	}
}



