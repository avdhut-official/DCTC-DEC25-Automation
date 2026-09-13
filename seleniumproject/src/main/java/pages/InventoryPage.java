package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class InventoryPage extends BasePage {

	
	private By inventoryContainer = By.id("inventory_container");
	private By backpackAddToCart = By.id("add-to-cart-sauce-labs-backpack");
	private By cartIcon = By.className("shopping_cart_link");
	
	
	public InventoryPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	public boolean isInventoryPageDisplayed()
	{
		return isDisplayed(backpackAddToCart);
	}
	
	public void addBackpackToCart()
	{
		click(backpackAddToCart);
	}
	
	public CartPage openCart()
	{
		click(cartIcon);
		return new CartPage(driver);
	}

}
