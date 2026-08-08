package day52;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo_52 {
	
	@Test
	public void login()
	{
		System.out.println("Login Test");
		//Assert.fail();
	}

	@Test(dependsOnMethods = "login")
	public void search()
	{
		System.out.println("Search Test");
	}

	
	public void checkout()
	{
		System.out.println("Checkout Test");
	}

}
