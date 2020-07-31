package testcases;

import org.junit.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import libraries.ExcelLibrary;
import pages.NewCustomerPage;

public class TC003 extends baseTest 
{
	@DataProvider()
	public Object[][] getData()
	{
		return ExcelLibrary.getExcelData(EXCEL_PATH, "Negative Testing");
	}
	
	@Test(dataProvider="getData")
	public void name(String Name)
	{
		NewCustomerPage s=new NewCustomerPage(driver, webactionutil);
		
	Assert.assertFalse(s.customerNameTF(Name));
		
	}

}
