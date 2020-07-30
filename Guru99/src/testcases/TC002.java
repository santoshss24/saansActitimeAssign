package testcases;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import libraries.ExcelLibrary;
import pages.NewCustomerPage;

public class TC002 extends baseTest 
{
	@DataProvider()
	public Object[][] getData()
	{
		return ExcelLibrary.getExcelData(EXCEL_PATH, "New Customer");
	}
	
	@Test(dataProvider="getData")
	public void name(String Name)
	{
		NewCustomerPage s=new NewCustomerPage(driver, webactionutil);
		
	Assert.assertTrue(s.customerNameTF(Name));
		
	}

}
