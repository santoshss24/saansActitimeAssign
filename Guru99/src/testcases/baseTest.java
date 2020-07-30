package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import libraries.IAutoconstants;
import libraries.WebActionUtil;
import pages.homePage;
import pages.loginPage;

public class baseTest implements IAutoconstants
{
	public WebDriver driver;
	public WebActionUtil webactionutil;
	@BeforeClass
	public void launchApp()
	{
		System.setProperty(GECKO_KEY,GECKO_VALUE);
		FirefoxOptions options=new FirefoxOptions();
		options.addPreference("dom.webnotifications.enabled", false);
		driver=new FirefoxDriver(options);
		driver.manage().window().maximize();
		long implicit=Long.parseLong(ITO);
		driver.manage().timeouts().implicitlyWait(implicit, TimeUnit.SECONDS);
		driver.get(APP_URL);
		long explicit=Long.parseLong(ETO);
		webactionutil=new WebActionUtil(driver, explicit);
	}
//	@BeforeMethod
//	public void loginToApp()
//	{
//		loginPage l=new loginPage(driver, webactionutil);
//		l.login(USERNAME, PASSWORD);
//	}
//	@AfterMethod
//	public void logoutToApp()
//	{
//		homePage h=new homePage(driver, webactionutil);
//		h.clickOnLogoutButton();
//	}
	@AfterClass(alwaysRun=true)
	public void closeApp()
	{
		driver.close();
	}

}
