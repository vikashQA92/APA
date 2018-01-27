package com.APA.SearchingInDirectory;

import java.awt.AWTException;
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

public class TC005_SearchingOnBasisOfLocationName extends TestBase
{
	LoginPage lp;
	HomePage hp;
	public static final Logger log=Logger.getLogger(TC005_SearchingOnBasisOfLocationName.class.getName());
	
	@BeforeMethod
	  public void setup(Method result) throws IOException
	  {
		  test = extent.startTest(result.getName());
		  test.log(LogStatus.INFO, result.getName() + " test Started");
		  init();
	  }
	
	@Test
	  public void searching_on_basis_of_location() throws AWTException, InterruptedException
	  {
		log.info("<===========Started Searching On Basis Of Location Functionality===========> ");
		lp=new LoginPage(driver);
		hp=new HomePage(driver);
		lp.login_to_application(OR.getProperty("username"),OR.getProperty("password"));
		wait_for_element_present(hp.directory);
		hp.click_on_directory();
		wait_for_element_present(hp.locationtextfield);
		hp.search_location_name("New York");
		wait_in_seconds(5);
		hp.click_search_button();
		wait_for_page_load(20);
		Assert.assertEquals(hp.identify_address("New York"), true);
		log.info("<===========Ended Searching On Basis Of Location Functionality===========> ");
	  }
	
	@AfterMethod
	public void afterMethod(ITestResult result) 
	{
    get_result(result);
    closeBrowser();
    }
	
}
