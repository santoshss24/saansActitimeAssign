package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import libraries.WebActionUtil;

public class Basepage 
{
	public WebDriver driver;
	public WebActionUtil webactionutil;
	
	public Basepage(WebDriver driver, WebActionUtil webactionutil) {
		this.driver=driver;
		this.webactionutil=webactionutil;
		
		PageFactory.initElements(driver, this);
	}

}
