package com.APA.SearchingInDirectory;

import java.io.IOException;
import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.APA.testBase.TestBase;
import com.APA.uiActions.HomePage;
import com.APA.uiActions.LoginPage;
import com.relevantcodes.extentreports.LogStatus;

public class TC012_ClickNotificationIcon extends TestBase {
	
	LoginPage lp;
	HomePage  hp;
	public static final Logger log=Logger.getLogger(TC012_ClickNotificationIcon.class.getName());
	
	@BeforeMethod
	  public void setup(Method result) throws IOException
	  {
		  test = extent.startTest(result.getName());
		  test.log(LogStatus.INFO, result.getName() + " test Started");
		  init();
	  }

	@Test
	 public void click_notification_icon()
	 {
		
	 }
}
