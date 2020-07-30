package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import libraries.WebActionUtil;

public class NewCustomerPage extends Basepage 
{

	@FindBy(name="name")
	private WebElement nameTF;
	
	public NewCustomerPage(WebDriver driver, WebActionUtil webactionutil) {
		super(driver, webactionutil);
		// TODO Auto-generated constructor stub
	}
	
	public boolean customerNameTF(String keysToSend)
	{
		webactionutil.enterKeys(nameTF, keysToSend);
		WebElement message = driver.findElement(By.id("message"));
		if(message.isDisplayed())
		{
			return false;
		}
		else return true;
	}

}
