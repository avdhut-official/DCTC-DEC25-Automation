package day52;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo_52_3 {
	
	
	
	@Test(groups = "SmokeTest")
	public void login()
	{
		System.out.println("Login Test");
		Assert.fail();
	}

	
	@Test(groups = "SmokeTest")
	public void search()
	{
		System.out.println("Search the Product");
	}
	
	
	@Test(groups="RegressionTest", dependsOnGroups = "SmokeTest")
	public void payment()
	{
		System.out.println("payment Test");
	}

}
