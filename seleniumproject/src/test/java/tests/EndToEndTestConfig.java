package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import base.BaseTestConfig;
import pages.CartPage;
import pages.CheckoutOverviewPage;
import pages.CheckoutPage;
import pages.InventoryPage;
import pages.LoginPage;
import pages.OrderConfirmationPage;
import utils.ConfigReader;

public class EndToEndTestConfig extends BaseTestConfig {
	
	@Test
	public void verifyCompletePurchaseFlow()
	{
		LoginPage loginPage = new LoginPage(driver);
		InventoryPage inventoryPage = loginPage.loginToApplication(ConfigReader.getProperty("username"),ConfigReader.getProperty("password"));
		
		Assert.assertTrue(inventoryPage.isInventoryPageDisplayed(),"Inventory page is not displayed");
		
		inventoryPage.addBackpackToCart();
		CartPage cartPage = inventoryPage.openCart();
		Assert.assertTrue(cartPage.isCartPageDisplayed(),"Cart Page is not displayed");
		Assert.assertTrue(cartPage.isBackpackDisplayed(),"Sauce Labs Backpack is not displayed");
		
		CheckoutPage checkoutPage = cartPage.openCart();
		CheckoutOverviewPage overviewPage = checkoutPage.enterCustomerDetails("Vinay", "Tyagi", "411011");
		
		Assert.assertTrue(overviewPage.isOverviewPageDisplayed(),"Checkout Page is not displayed");
		
		OrderConfirmationPage confirmationPage = overviewPage.clickFinish();
		Assert.assertTrue(confirmationPage.isOrderSuccessful(),"Order was not completed successfully");
		
		Assert.assertEquals(confirmationPage.getConfirmationMessage(), "Thank you for your order!");
		
		
	}

}
