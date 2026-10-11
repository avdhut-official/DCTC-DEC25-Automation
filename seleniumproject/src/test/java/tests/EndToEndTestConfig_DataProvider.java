package tests;

import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import TestData.CheckoutDataProvider;
import base.BaseTestConfig;
import pages.CartPage;
import pages.CheckoutOverviewPage;
import pages.CheckoutPage;
import pages.InventoryPage;
import pages.LoginPage;
import pages.OrderConfirmationPage;
import utils.ConfigReader;
import utils.LoggerUtil;

public class EndToEndTestConfig_DataProvider extends BaseTestConfig {
	
	
	private static final Logger logger = LoggerUtil.getLogger(EndToEndTestConfig_DataProvider.class);
	
	@Test(dataProvider = "checkoutData", dataProviderClass = CheckoutDataProvider.class, groups= {"smoke_e2e","regression"})
	public void verifyCompletePurchaseFlow(String firstName, String lastName, String postalCode)
	{
		
		logger.info("Starting purchase flow for : {} {}", firstName,lastName);
				
		LoginPage loginPage = new LoginPage(driver);
		InventoryPage inventoryPage = loginPage.loginToApplication(ConfigReader.getProperty("username"),ConfigReader.getProperty("password"));
		logger.info("Test driver is null: {}", driver == null);
		Assert.assertTrue(inventoryPage.isInventoryPageDisplayed(),"Inventory page is not displayed");
		
		logger.info("Login Successful; inventory page verified");
		
		inventoryPage.addBackpackToCart();
		logger.info("Sauce Labs Backpack is added to Cart");
		
		CartPage cartPage = inventoryPage.openCart();
		Assert.assertTrue(cartPage.isCartPageDisplayed(),"Cart Page is not displayed");
		Assert.assertTrue(cartPage.isBackpackDisplayed(),"Sauce Labs Backpack is not displayed");
		logger.info("Product verified in cart");
		
		CheckoutPage checkoutPage = cartPage.openCart();
		CheckoutOverviewPage overviewPage = checkoutPage.enterCustomerDetails(firstName, lastName, postalCode);
		
		Assert.assertTrue(overviewPage.isOverviewPageDisplayed(),"Checkout Page is not displayed");
		
		OrderConfirmationPage confirmationPage = overviewPage.clickFinish();
		Assert.assertTrue(confirmationPage.isOrderSuccessful(),"Order was not completed successfully");
		
		Assert.assertEquals(confirmationPage.getConfirmationMessage(), "Thank you for your order!");
		
		logger.info("Purchase flow successfully Completed for : {} {}", firstName,lastName);
	}

}
