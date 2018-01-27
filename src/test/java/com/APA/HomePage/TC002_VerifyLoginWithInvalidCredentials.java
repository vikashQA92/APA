package com.APA.HomePage;

import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.APA.testBase.TestBase;
import com.APA.uiActions.LoginPage;
import com.relevantcodes.extentreports.LogStatus;


import jxl.read.biff.BiffException;

public class TC002_VerifyLoginWithInvalidCredentials extends TestBase {
	
	LoginPage lp;
	public static final Logger log=Logger.getLogger(TC002_VerifyLoginWithInvalidCredentials.class.getName());
	
	@BeforeMethod
	  public void setup(Method result) throws IOException
	  {
		  test = extent.startTest(result.getName());
		  test.log(LogStatus.INFO, result.getName() + " test Started");
		  init();
	  }
	
	@DataProvider(name="loginData")
	public String[][] getTestData() throws BiffException, IOException
	{
		String[][] testRecords = getData("TestData.xls", "Sheet1");
		return testRecords;
	}
	
	@Test (dataProvider="loginData")
	
	public void verify_login_with_invalid_credentials(String username, String password)
	{
		  log.info("<===========Starting Verify Login With Invalid Credentials Test===========> ");
		  lp=new LoginPage(driver);
		  lp.login_to_application(username, password);
		  Assert.assertEquals(lp.verify_login(), "http://education-psychiatry-qc.astutetech.com/Admin/Account/Login");
		  log.info("<===========Ended Verify Login With Invalid Credentials Test===========> ");
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result) {
    get_result(result);
    closeBrowser();
    
}

}
