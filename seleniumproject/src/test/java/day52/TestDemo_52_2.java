package day52;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo_52_2 {
	
	
	
	@Test
	public void login()
	{
		System.out.println("Login Test");
		//Assert.fail();
	}

	@Test
	public void verifyUser()
	{
		System.out.println("Verify User");
		Assert.fail();
	}
	
	@Test(dependsOnMethods = "verifyUser")
	public void search()
	{
		System.out.println("Search the Product");
	}
	
	
	@Test(dependsOnMethods = {"search","verifyUser"})
	public void checkout()
	{
		System.out.println("Checkout Test");
	}

}
