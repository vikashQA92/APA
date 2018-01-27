package com.APA.SearchingInDirectory;

import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.APA.testBase.TestBase;
import com.APA.uiActions.HomePage;
import com.APA.uiActions.LoginPage;
import com.relevantcodes.extentreports.LogStatus;

public class TC007_LanguageDropdownSelection extends TestBase {
	public static final Logger log=Logger.getLogger(TC007_LanguageDropdownSelection.class.getName());
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
		  wait_for_page_load(10);
	  }
	
	@Test
	public void language_dropdown_selection() throws InterruptedException
	{
		log.info("<===========Started language selection Test===========> ");
		hp.select_language();
		wait_in_seconds(10);
		log.info("<===========Ended language selection Test===========> ");
	}
	
	@AfterMethod
	public void afterMethod(ITestResult result) 
	{
    get_result(result);
    closeBrowser();
    }

}
