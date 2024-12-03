package com.pom.TestRunner;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.pom.PageObjects.RegisterPage;
import com.pom.TestBase.BaseClass;
import com.pom.TestBase.Constants;
import com.pom.TestBase.DataGenarator;
import com.pom.TestUtility.DriverHelper;
import com.pom.TestUtility.ListenerHelper;

@Listeners(ListenerHelper.class)
public class SampleRunner extends BaseClass {

	RegisterPage registerPage;

	@BeforeClass
	public void setup() {
		getDriver(Constants.getBrowser(), Constants.incognito, Constants.maximized);
		DriverHelper.maximize();
		DriverHelper.implicitlyWait(2);
		DriverHelper.get(Constants.getPageURL());
		registerPage = new RegisterPage();
	}

	@Test
	public void tc_001() {
		System.out.println(DriverHelper.getTitle());
	}

	@Test
	public void tc_002() {
		System.out.println(DriverHelper.getCurrentUrl());
	}

	@Test(dataProvider = "qadata", dataProviderClass = DataGenarator.class)
	public void tc_003(String firstname, String lastname, String mobilenumber, String password) {
		registerPage.createNewAccount(firstname, lastname, mobilenumber, password);
	}

}
