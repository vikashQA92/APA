package com.APA.HomePage;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.APA.testBase.TestBase;
import com.APA.uiActions.LoginPage;
import com.relevantcodes.extentreports.LogStatus;

public class TC001_LoginWithValidCredentials extends TestBase {
	
	LoginPage lp;
	public static final Logger log=Logger.getLogger(TC001_LoginWithValidCredentials.class.getName());
	
	@BeforeMethod
	  public void setup(Method result) throws IOException
	  {
		  test = extent.startTest(result.getName());
		  test.log(LogStatus.INFO, result.getName() + " test Started");
		  init();
	  }
	
	@Test
	  public void verify_login_with_valid_credentials()
	  { 
		  log.info("<===========Starting Verify Login With Valid Credentials Test===========> ");
		  lp=new LoginPage(driver);
		  lp.login_to_application(OR.getProperty("username"),OR.getProperty("password"));
		  wait_until_url_contains("DashBoard");
		  Assert.assertEquals(lp.verify_login(), "http://education-psychiatry-qc.astutetech.com/Admin/DashBoard/Index");
		  log.info("<===========Ended Verify Login With Valid Credentials Test===========> ");
	  }
	
	@AfterMethod
	public void afterMethod(ITestResult result) {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	//	Thread.sleep(3000);
		
    get_result(result);
    
    closeBrowser();
    
}

    /* @AfterClass(alwaysRun = true)
	public void endTest() {
		closeBrowser();
}*/

}
