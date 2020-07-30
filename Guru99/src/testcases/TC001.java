package testcases;

import org.testng.annotations.Test;

import pages.homePage;

public class TC001 extends baseTest {
	
	@Test
	public void NewCustomer()
	{
		homePage h=new homePage(driver, webactionutil);
		h.clickOnNewCustomer();
		
		
		
	}
	

}
