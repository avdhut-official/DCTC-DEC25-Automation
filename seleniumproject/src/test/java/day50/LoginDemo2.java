package day50;

import org.testng.annotations.Test;

public class LoginDemo2 {
	
	
	//Login, search, add to cart and logout
	@Test(priority = 1)
	public void login()
	{
		System.out.println("Login");
	}
	
	@Test(priority = 2)
	public void search()
	{
		System.out.println("Search a Product");
	}
	
	@Test(priority = 4)
	public void cart()
	{
		System.out.println("added to Cart");
	}
	
	@Test(priority = 5)
	public void logout()
	{
		System.out.println("Logged out");
	}
	
	@Test(priority = 3)
	public void clickOnProduct()
	{
		System.out.println("Clicked");
	}

}
