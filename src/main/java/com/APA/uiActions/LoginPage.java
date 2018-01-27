package com.APA.uiActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.APA.testBase.TestBase;

public class LoginPage extends TestBase
{
	WebDriver driver;
    public static final Logger log=Logger.getLogger(LoginPage.class.getName());
    
    @FindBy(xpath=".//*[@id='UserName']")
    WebElement EnterEmailField; //Web Element and Xpath For Enter Your Email Field
    
    @FindBy(xpath=".//*[@id='Password']")
    WebElement EnterPasswordField; //Web Element and Xpath For Enter Your Password Field
    
    @FindBy(xpath=".//*[@id='btnLogin']")
    WebElement SigninButton; //Web Element and Xpath for SignIn button
    
    /*...................> Method to initialize driver and web elements <..........................*/
    
    public LoginPage(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
    
    /*...................> Method to Login to application <..........................*/
    
    public void login_to_application(String username, String password) 
    {
 	   
      EnterEmailField.sendKeys(username);
 	   log.info("Entered emailaddress " +username+ " and object is "+EnterEmailField.toString());
 	  EnterPasswordField.sendKeys(password);
 	   log.info("Entered Password " +password+ " and object is "+EnterPasswordField.toString());
 	  SigninButton.click();
 	   log.info("clicked on submit button and object is "+SigninButton.toString());  
 	}
    
    /*...................> Method to Verify Login Functioanlity <..........................*/
    
    public String verify_login()
    {
    	return driver.getCurrentUrl();
    }

}
