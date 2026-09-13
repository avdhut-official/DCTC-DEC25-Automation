package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class CartPage extends BasePage{

	private By cartContainer = By.id("cart_contents_container");
	private By backPack = By.xpath("//div[@class='inventory_item_name' and text()='Sauce Labs Backpack']");
	private By checkoutBtn=By.id("checkout");
	
	
	public CartPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isCartPageDisplayed()
	{
		return isDisplayed(cartContainer);
	}
	
	public boolean isBackpackDisplayed()
	{
		return isDisplayed(backPack);
	}
	
	public CheckoutPage openCart()
	{
		click(checkoutBtn);
		return new CheckoutPage(driver);
	}
	

}
