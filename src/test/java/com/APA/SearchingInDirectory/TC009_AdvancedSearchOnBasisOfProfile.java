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

public class TC009_AdvancedSearchOnBasisOfProfile extends TestBase {
	
	LoginPage lp;
	HomePage  hp;
	public static final Logger log=Logger.getLogger(TC009_AdvancedSearchOnBasisOfProfile.class.getName());
	
	@BeforeMethod
	  public void setup(Method result) throws IOException
	  {
		  test = extent.startTest(result.getName());
		  test.log(LogStatus.INFO, result.getName() + " test Started");
		  init();
	  }
	
	@Test
	  public void advancd_searching_user_on_basis_of_profile() throws InterruptedException
	  { 
		  log.info("<===========Advanced Searching Of User On Basis Of Profile Functionality===========> ");
		  lp=new LoginPage(driver);
		  hp=new HomePage(driver);
		  lp.login_to_application(OR.getProperty("username"),OR.getProperty("password"));
		  wait_for_element_present(hp.directory);
		  hp.click_on_directory();
		  wait_for_element_present(hp.searchtitletextfield);
		  wait_in_seconds(10);
		  hp.search_title("Boston");
		  wait_in_seconds(10);
		  hp.click_search_button();
		  wait_in_seconds(10);
		  wait_for_element_present(hp.advancesearch);
		  hp.click_on_advancedsearch();
		  wait_in_seconds(5);
		  hp.select_distance_and_location();
		  wait_in_seconds(10);
		  /*scroll_down();
		  wait_for_page_load(20);
		  Assert.assertEquals(hp.identify_address("Boston"), true);
		  scroll_down();
		  wait_for_page_load(20);*/
		  log.info("<===========Ended Advanced Searching Of User On Basis Of Profile Functionality===========> ");
	  }
	
	@AfterMethod
	public void afterMethod(ITestResult result) 
	{
    get_result(result);
    closeBrowser();
    
    }


}
