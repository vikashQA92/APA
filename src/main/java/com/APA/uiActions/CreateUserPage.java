package com.APA.uiActions;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.APA.testBase.TestBase;

public class CreateUserPage extends TestBase{
	
	WebDriver driver;
    public static final Logger log=Logger.getLogger(CreateUserPage.class.getName());
    
    @FindBy(xpath="//input[@id='first_name' and @placeholder='First name']")
    public WebElement firstnametextfield;

    @FindBy(xpath="//input[@id='first_name' and @placeholder='Last name']")
    public WebElement lastnametextfield;
    
    @FindBy(xpath="//input[@id='email' and @placeholder='Username@gmail.com']")
    public WebElement emailaddressfield;
    
    @FindBy(xpath="//div[@class='form-group']//span[@class='k-input ng-scope']")
    public WebElement selectlocationdropdown;
    
    @FindBy(xpath="//ul[@id='servcorp_location_listbox']/li")
    public List<WebElement> locations;
    
    @FindBy(xpath="//input[@id='CompamyName' and @placeholder='Enter company name']")
    public WebElement companynamefield;
    
    @FindBy(xpath="//input[@id='SercorpPhone_number' and @name='SercorpPhone_number']")
    public WebElement globaldialextentionfield;
    
    @FindBy(xpath="//div[@class='form-group']//input[@name='Language_input']")
    public WebElement selectlanguagedropdown;
    
    @FindBy(xpath="//ul[@class='k-list k-reset' and @aria-live='polite']//li")
    public List<WebElement> languages;
    
    @FindBy(xpath="//input[@id='Phone_number' and @name='Phone_number']")
    public WebElement phonenumberfield;
    
    @FindBy(xpath="//input[@id='website' and @name='WebsiteUrl']")
    public WebElement yourwebsitefield;
    
    @FindBy(xpath="//input[@id='personal_medical' and @name='personal_medical']")
    public WebElement facilitatorcheckbox;
    
    @FindBy(xpath="//button[@id='submitButton' and @name='submitButton']")
    public WebElement createbutton;
    
    public CreateUserPage(WebDriver driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
    }
    
    public void create_user(String firstname, String lastname, String emailaddress, String companyname, String globalextension, String phonenumber, String websitename) throws InterruptedException
    {
    	firstnametextfield.sendKeys(firstname);
    	lastnametextfield.sendKeys(lastname);
    	emailaddressfield.sendKeys(emailaddress);
    	select_location();
    	companynamefield.sendKeys(companyname);
    	globaldialextentionfield.sendKeys(globalextension);
    	select_language();
    	phonenumberfield.sendKeys(phonenumber);
    	yourwebsitefield.sendKeys(websitename);
    	facilitatorcheckbox.click();
    	createbutton.click();
    }
    
    public void select_location() throws InterruptedException
    {
    	wait_for_element_present(selectlocationdropdown);
    	selectlocationdropdown.click();
    	bootstrap_dropdown(locations, "Chifley Tower, Sydney, Australia");
    	
    }
    
    public void select_language() throws InterruptedException
    {
    	wait_for_element_present(selectlanguagedropdown);
    	selectlanguagedropdown.click();
    	bootstrap_dropdown(languages, "Japanese");
    }
    
    
}

