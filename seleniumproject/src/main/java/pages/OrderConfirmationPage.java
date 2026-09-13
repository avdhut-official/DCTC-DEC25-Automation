package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class OrderConfirmationPage extends BasePage{

	private By confirmationMessage = By.className("complete-header");
	
	public OrderConfirmationPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isOrderSuccessful()
	{
		return isDisplayed(confirmationMessage);
	}
	
	public String getConfirmationMessage()
	{
		return getText(confirmationMessage);
	}
	
}
