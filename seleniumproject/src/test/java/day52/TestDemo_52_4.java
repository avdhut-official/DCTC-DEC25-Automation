package day52;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo_52_4 {
	
	
	
	@Test(groups = {"SmokeTest","RegressionTest"})
	public void login()
	{
		System.out.println("Login Test");
		//Assert.fail();
	}

	
	@Test(groups = "SmokeTest")
	public void search()
	{
		System.out.println("Search the Product");
	}
	
	@Test(groups = {"SmokeTest","RegressionTest"})
	public void logout()
	{
		System.out.println("Logout Test");
		//Assert.fail();
	}
	
	@Test(groups="RegressionTest")
	public void payment()
	{
		System.out.println("payment Test");
	}

}
