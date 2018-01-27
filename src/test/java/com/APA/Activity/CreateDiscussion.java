package com.APA.Activity;

import java.awt.AWTException;
import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.APA.HomePage.TC001_LoginWithValidCredentials;
import com.APA.testBase.TestBase;
import com.APA.uiActions.Discussion;
import com.APA.uiActions.HomePage;
import com.APA.uiActions.LoginPage;
import com.relevantcodes.extentreports.LogStatus;

public class CreateDiscussion extends TestBase{
	LoginPage lp;
	HomePage hp;
	Discussion ds;
	public static final Logger log=Logger.getLogger(TC001_LoginWithValidCredentials.class.getName());
	
	@BeforeMethod
	  public void setup(Method result) throws IOException
	  {
		  test = extent.startTest(result.getName());
		  test.log(LogStatus.INFO, result.getName() + " test Started");
		  init();
	  }
	
	@Test
	  public void verify_login_with_valid_credentials() throws InterruptedException, AWTException
	  { 
		  log.info("<===========Starting Verify Login With Valid Credentials Test===========> ");
		  lp=new LoginPage(driver);
		  ds=new Discussion(driver);
		 lp.login_to_application(OR.getProperty("username"),OR.getProperty("password"));
		
		  wait_until_url_contains("dashboard");
		  ds.create_discussion("deepakS", "test", "Deepak singh");
		//  Assert.assertEquals(lp.verify_login(), "http://pentest.servcorpcommunity.com/home/global/dashboard");
		  log.info("<===========Ended Verify Login With Valid Credentials Test===========> ");
		 
		  
	  }
	/*@AfterMethod
	public void afterMethod(ITestResult result) 
	{
    get_result(result);
    closeBrowser();
*/
}

