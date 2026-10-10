package tests;

import org.apache.logging.log4j.Logger;
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
import utils.LoggerUtil;

public class EndToEndTestConfig extends BaseTestConfig {
	
	
	private static final Logger logger = LoggerUtil.getLogger(EndToEndTestConfig.class);
	
	@Test
	public void verifyCompletePurchaseFlow()
	{
		
		logger.info("Starting End to End purchase flow");
		
		LoginPage loginPage = new LoginPage(driver);
		InventoryPage inventoryPage = loginPage.loginToApplication(ConfigReader.getProperty("username"),ConfigReader.getProperty("password"));
		
		Assert.assertTrue(inventoryPage.isInventoryPageDisplayed(),"Inventory page is not displayed");
		
		logger.info("Login Successful; inventory page verified");
		
		inventoryPage.addBackpackToCart();
		logger.info("Sauce Labs Backpack is added to Cart");
		
		CartPage cartPage = inventoryPage.openCart();
		Assert.assertTrue(cartPage.isCartPageDisplayed(),"Cart Page is not displayed");
		Assert.assertTrue(cartPage.isBackpackDisplayed(),"Sauce Labs Backpack is not displayed");
		
		CheckoutPage checkoutPage = cartPage.openCart();
		CheckoutOverviewPage overviewPage = checkoutPage.enterCustomerDetails("Vinay", "Tyagi", "411011");
		
		Assert.assertTrue(overviewPage.isOverviewPageDisplayed(),"Checkout Page is not displayed");
		
		OrderConfirmationPage confirmationPage = overviewPage.clickFinish();
		Assert.assertTrue(confirmationPage.isOrderSuccessful(),"Order was not completed successfully");
		
		Assert.assertEquals(confirmationPage.getConfirmationMessage(), "Thank you for your order!");
		
		logger.info("End to End purchase flow completed successfully");
	}

}
