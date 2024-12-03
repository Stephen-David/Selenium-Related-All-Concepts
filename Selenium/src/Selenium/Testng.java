package Selenium;

import org.testng.annotations.Test;

public class Testng {
	@Test(dependsOnMethods ="smoke")

	public void m1()

	{

		System.out.println("page title");

	}

	

	@Test(description = "This test is used to print webpage url",enabled = false)

	public void m2()

	{

		System.out.println("page url");

	}

	

	@Test(description = "This test is used to print webpage links count",groups="stephen")

	public void m3()

	{

		System.out.println("page links count");

	}

	

	@Test(description = "This test is used to print webpage links text and attribute")

	public void m4()

	{

		System.out.println("page links text and attribute");

	}

	

	@Test(description = "This test is used to verify login with invalid crediantals")

	public void m5()

	{

		System.out.println("login verification");

	}

	

	

}




