package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import libraries.WebActionUtil;
import testcases.baseTest;

public class homePage extends Basepage 
{
	@FindBy(xpath="//a[.='Log out']")
	private WebElement logoutButton;
	
	@FindBy(xpath="//a[.='New Customer']")
	private WebElement newCustomer;
	
	public homePage(WebDriver driver, WebActionUtil webactionutil) {
		super(driver, webactionutil);
		// TODO Auto-generated constructor stub
	}
	
	public void clickOnLogoutButton()
	{
		webactionutil.clickOnElement(logoutButton);
	}
	public void clickOnNewCustomer()
	{
		webactionutil.clickOnElement(newCustomer);
	}

}
