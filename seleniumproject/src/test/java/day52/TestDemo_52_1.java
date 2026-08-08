package day52;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo_52_1 {
	
	@Test
	public void launchBrowser()
	{
		System.out.println("Launch Browser");
	}
	
	@Test(dependsOnMethods = "launchBrowser")
	public void login()
	{
		System.out.println("Login Test");
		//Assert.fail();
	}

	@Test(dependsOnMethods = "login")
	public void search()
	{
		System.out.println("Search Test");
		Assert.fail();
	}

	@Test(dependsOnMethods = "search")
	public void addToCart()
	{
		System.out.println("Add to Cart Test");
		//Assert.fail();
	}
	
	@Test(dependsOnMethods = "addToCart")
	public void checkout()
	{
		System.out.println("Checkout Test");
	}

}
