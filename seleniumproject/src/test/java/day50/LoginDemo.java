package day50;

import org.testng.annotations.Test;

public class LoginDemo {
	
	
	//Login, search, add to cart and logout
	@Test
	public void login()
	{
		System.out.println("Login");
	}
	
	@Test
	public void search()
	{
		System.out.println("Search a Product");
	}
	
	@Test
	public void cart()
	{
		System.out.println("added to Cart");
	}
	
	@Test
	public void logout()
	{
		System.out.println("Logged out");
	}
	
	@Test
	public void clickOnProduct()
	{
		System.out.println("Clicked");
	}

}
