package com.APA.uiActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.APA.testBase.TestBase;

public class AdminDashboardPage extends TestBase {

	WebDriver driver;
    public static final Logger log=Logger.getLogger(AdminDashboardPage.class.getName());
    
    @FindBy(xpath="//a[@class='dropdown-toggle ng-binding' and text()='Manage Members']")
	public WebElement managememberstab;
    
    @FindBy(xpath="//a[@ui-sref='managemember' and text()=' Activated Members']")
    public WebElement activatedmemberstab;
    
    @FindBy(xpath="//a[@class='create_benefit_btn btn com_btn ng-binding' and text()=' Create user']")
    public WebElement createuserbutton;
    
    public AdminDashboardPage(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    
    public void create_user_button() throws InterruptedException
    {
    	handlingactions(managememberstab);
    	wait_in_seconds(5);
    	activatedmemberstab.click();
    	wait_for_element_present(createuserbutton);
    	createuserbutton.click();
    }
}
