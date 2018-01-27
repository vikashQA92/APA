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

public class TC006_DisplayProfileImages extends TestBase {
	
	public static final Logger log=Logger.getLogger(TC006_DisplayProfileImages.class.getName());
	LoginPage lp;
	HomePage  hp;
	
	@BeforeMethod
	  public void setup(Method result) throws IOException, InterruptedException
	  {
		  test = extent.startTest(result.getName());
		  test.log(LogStatus.INFO, result.getName() + " test Started");
		  init();
		  lp=new LoginPage(driver);
		  hp=new HomePage(driver);
		  lp.login_to_application(OR.getProperty("username"),OR.getProperty("password"));
		  wait_for_element_present(hp.directory);
		  hp.click_on_directory();
		  wait_in_seconds(5);
		  wait_for_element_present(hp.searchtitletextfield);
	  }
	@Test(priority=1)
	  public void search_profile_image() throws InterruptedException
	  {
		log.info("<===========Started Verifying searchprofileimage Test===========> ");
		  
		  hp.search_title(OR.getProperty("title"));
		  wait_in_seconds(5);
		  hp.click_search_button();
		  wait_in_seconds(5);
		  scroll_down();
		  Assert.assertEquals(hp.verify_profile_images(), 10);
		  log.info("<===========Ended Verifying searchprofileimage Test===========> ");
	  }
	@Test(priority=2)
	  public void members_not_in_connection() throws InterruptedException
	  {
		log.info("<===========Started Verifying Members not in connection Test===========> ");
		
		  hp.search_title(OR.getProperty("connectionName"));
		  wait_in_seconds(5);
		  hp.click_search_button();
		  wait_in_seconds(5);
		  hp.click_on_profiletab();
		  wait_in_seconds(5);
		  scroll_down();
		  Assert.assertEquals(hp.verify_profile_name(OR.getProperty("profileName")), false);
		  log.info("<===========Ended Verifying Members not in connection Test===========> ");
	  }
	
	@AfterMethod
	public void afterMethod(ITestResult result) 
	{
    get_result(result);
    closeBrowser();
    
    }

}
