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
import com.APA.uiActions.AdminDashboardPage;
import com.APA.uiActions.CreateUserPage;
import com.APA.uiActions.LoginPage;
import com.relevantcodes.extentreports.LogStatus;

public class TC011_CreateUserProfile extends TestBase {
	LoginPage lp;
	AdminDashboardPage ad;
	CreateUserPage cu;
	public static final Logger log=Logger.getLogger(TC011_CreateUserProfile.class.getName());
	
	@BeforeMethod
	  public void setup(Method result) throws IOException, InterruptedException
	  {
		  test = extent.startTest(result.getName());
		  test.log(LogStatus.INFO, result.getName() + " test Started");
		  init();
		  lp=new LoginPage(driver);
		  ad=new AdminDashboardPage(driver);
		  cu=new CreateUserPage(driver);
		  lp.login_to_application(OR.getProperty("admin"),OR.getProperty("adminpwd"));
		  wait_for_element_present(ad.managememberstab);
	  }
	@Test
	  public void create_user_profile() throws InterruptedException
	  {
		log.info("<===========Started Create User Profile Test===========> ");
		 
		ad.create_user_button();
		wait_for_element_present(cu.firstnametextfield);
		cu.create_user("ram", "test", System.currentTimeMillis()+"ram@gmail.com","smartdata","1245621452","2147845698","www.smartdata.com");
		
		log.info("<===========Ended Create User Profile Test===========> ");
	  }
	
	@AfterMethod
	public void afterMethod(ITestResult result) 
	{
    get_result(result);
    closeBrowser();
    
    }

}
