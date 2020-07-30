package libraries;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebActionUtil 
{
	public WebDriver driver;
	public long ETO;
	public WebDriverWait wait;
	public WebActionUtil(WebDriver driver,long ETO) {
		
		this.driver=driver;
		this.ETO=ETO;
		wait=new WebDriverWait(driver, ETO);
	}
	public void clickOnElement(WebElement target)
	{
		wait.until(ExpectedConditions.elementToBeClickable(target));
		target.click();
		
	}
	public void enterKeys(WebElement target, String keysToSend)
	{
		wait.until(ExpectedConditions.visibilityOf(target));
		target.clear();
		target.sendKeys(keysToSend);
	}

}
