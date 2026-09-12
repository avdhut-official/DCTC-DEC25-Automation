package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginTest_1 extends BaseTest {
	
	
	LoginPage login_p;
	@Test
	public void validLoginTest()
	{
		login_p = new LoginPage(driver);
		login_p.login("standard_user", "secret_sauce");
	}

	@Test
	public void invalidLoginTest()
	{
		login_p = new LoginPage(driver);
		login_p.login("standard_user", "secret_sauce_1");
	}
}
