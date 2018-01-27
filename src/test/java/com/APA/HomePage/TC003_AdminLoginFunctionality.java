package com.APA.HomePage;

import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.APA.testBase.TestBase;
import com.APA.uiActions.LoginPage;
import com.relevantcodes.extentreports.LogStatus;

public class TC003_AdminLoginFunctionality extends TestBase {
	
	LoginPage lp;
	public static final Logger log=Logger.getLogger(TC003_AdminLoginFunctionality.class.getName());
	
	@BeforeMethod
	  public void setup(Method result) throws IOException
	  {
		  test = extent.startTest(result.getName());
		  test.log(LogStatus.INFO, result.getName() + " test Started");
		  init();
	  }
	
	@Test
	  public void verify_admin_login_with_valid_credentials()
	  { 
		  log.info("<===========Starting Verify Login With Admin Credentials Test===========> ");
		  lp=new LoginPage(driver);
		  lp.login_to_application(OR.getProperty("admin"),OR.getProperty("adminpwd"));
		  wait_until_url_contains("dashboard");
		  Assert.assertEquals(lp.verify_login(), "http://education-psychiatry-qc.astutetech.com/Admin/Account/Login");
		  log.info("<===========Ended Verify Login With Admin Credentials Test===========> ");
	  }
	
	@AfterMethod
	public void afterMethod(ITestResult result) {
    get_result(result);
    closeBrowser();
    
}

}
