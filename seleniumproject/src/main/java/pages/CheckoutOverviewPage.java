package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class CheckoutOverviewPage extends BasePage {

	private By overviewContainer = By.id("checkout_summary_container");
	private By finishBtn = By.id("finish");
	
	
	public CheckoutOverviewPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isOverviewPageDisplayed()
	{
		return isDisplayed(overviewContainer);
	}
	
	public OrderConfirmationPage clickFinish()
	{
		click(finishBtn);
		return new OrderConfirmationPage(driver);
	}

}
