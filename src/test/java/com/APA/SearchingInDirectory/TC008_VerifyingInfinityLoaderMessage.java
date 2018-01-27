package com.APA.SearchingInDirectory;

import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.APA.testBase.TestBase;
import com.APA.uiActions.HomePage;
import com.APA.uiActions.LoginPage;
import com.relevantcodes.extentreports.LogStatus;



public class TC008_VerifyingInfinityLoaderMessage extends TestBase {
	
	public static final Logger log=Logger.getLogger(TC008_VerifyingInfinityLoaderMessage.class.getName());
	LoginPage lp;
	HomePage  hp;
	
	@BeforeMethod
	  public void setup(Method result) throws IOException
	  {
		  test = extent.startTest(result.getName());
		  test.log(LogStatus.INFO, result.getName() + " test Started");
		  init();
	  }
	
	@Test
	 public void verify_infity_loader_message() throws InterruptedException
	 {
		log.info("<===========Started Verifying Infinity Loader Message Test===========> ");
		  lp=new LoginPage(driver);
		  hp=new HomePage(driver);
		  lp.login_to_application(OR.getProperty("username"),OR.getProperty("password"));
		  wait_for_element_present(hp.directory);
		  hp.click_on_directory();
		  wait_in_seconds(5);
		  wait_for_element_present(hp.searchtitletextfield);
		  hp.search_title(OR.getProperty("title"));
		  wait_in_seconds(5);
		  hp.click_search_button();
		  wait_in_seconds(5);
		  scroll_down();
		  wait_in_seconds(5);
		  scroll_down_to_element(hp.endoffeedtext);
		  Assert.assertEquals(hp.end_of_feed(), "End of Feed. Nothing to see here.");
		  log.info("<===========Ended Verifying Infinity Loader Message Test===========> ");
	 }
	
	@AfterMethod
	public void afterMethod(ITestResult result) 
	{
    get_result(result);
    closeBrowser();
    
    }

}
