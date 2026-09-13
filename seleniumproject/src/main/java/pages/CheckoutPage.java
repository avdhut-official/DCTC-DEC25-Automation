package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class CheckoutPage extends BasePage{

	private By firstName = By.id("first-name");
	private By lastName = By.id("last-name");
	private By postalCode = By.id("postal-code");
	private By continuteBtn = By.id("continue");
	
	
	public CheckoutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	public CheckoutOverviewPage enterCustomerDetails(String firstNameText, String lastNameText, String postalCodeText)
	{
		type(firstName, firstNameText);
		type(lastName, lastNameText);
		type(postalCode, postalCodeText);
		click(continuteBtn);
		return new CheckoutOverviewPage(driver);
	}

}
