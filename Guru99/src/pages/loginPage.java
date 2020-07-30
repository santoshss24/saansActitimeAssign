package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import libraries.WebActionUtil;

public class loginPage extends Basepage 
{	
	@FindBy(name="uid")
	private WebElement usernameTF;
	
	@FindBy(name="password")
	private WebElement passwordTF;
	
	@FindBy(xpath="//a[@href=\"Logout.php\"]")
	private WebElement loginButton;

	public loginPage(WebDriver driver, WebActionUtil webactionutil) {
		super(driver, webactionutil);
		// TODO Auto-generated constructor stub
	}
	
	public void login(String username,String password)
	{
		webactionutil.enterKeys(usernameTF, username);
		webactionutil.enterKeys(passwordTF, password);
		webactionutil.clickOnElement(loginButton);
	}

}
