package com.APA.uiActions;

import java.awt.AWTException;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.APA.testBase.TestBase;

public class CreateLiveActivity extends TestBase {
	WebDriver driver;
	public static final Logger log=Logger.getLogger(HomePage.class.getName());
	
	         //   @FindBy(xpath=".//*[@id='dashBoard']/span")
	          //  public WebElement dashboard;
	@FindBy(xpath=".//*[@id='side-menu']/li[4]/a")
	public WebElement ActivityManagement;        //WebElement and Xpath for .
	@FindBy(xpath=".//*[@id='side-menu']/li[4]/ul/li[2]/a[1]") 
	public WebElement CreateAct; //
	@FindBy(xpath=".//*[@id='Content1']/div[2]/div[3]/div/div[2]/p[1]/a[1]") 
	public WebElement LiveEvent; //

	@FindBy(xpath=".//*[@id='ContentPlaceHolder1_txt_ceofferingTitle']") 
	public WebElement EventTitle; //

	@FindBy(xpath=".//*[@id='ContentPlaceHolder1_drpCourseFormat']/option[6]") 
	public WebElement SelectCategory; //
	
	//@FindBy(id="ContentPlaceHolder1_drpCourseFormat")
  //  List<WebElement> Category_List;
	
   

	@FindBy(xpath=".//*[@id='side-menu']/li[4]/a") 
	public WebElement selectvalue; //
	@FindBy(xpath=".//*[@id='ctl00_ContentPlaceHolder1_txt_credits_text']") 
	public WebElement Credits; //
	
	@FindBy(xpath=".//*[@id='ctl00_ContentPlaceHolder1_txt_eventStartDate_popupButton']") 
	public WebElement EventStartDateClick; //
	
	@FindBy(xpath=".//*[@id='ctl00_ContentPlaceHolder1_txt_eventStartDate_calendar_Top']/tbody/tr[1]/td[2]/a") 
	public WebElement EventStartDateSelect; //

	@FindBy(xpath=".//*[@id='ctl00_ContentPlaceHolder1_txt_eventEndDate_popupButton']") 
	public WebElement EventEndDateClick; //

	@FindBy(xpath=".//*[@id='ctl00_ContentPlaceHolder1_txt_eventEndDate_calendar_Top']/tbody/tr[1]/td[3]/a") 
	public WebElement EventEndDateSelect; //

	@FindBy(xpath=".//*[@id='ContentPlaceHolder1_cb_hasEval']") 
	public WebElement IncludeEvaluation; //
	
	@FindBy(xpath=".//*[@id='ContentPlaceHolder1_cb_hasCertificate']") 
	public WebElement IncludeCertificate; //
	
	@FindBy(xpath=".//*[@id='ctl00_ContentPlaceHolder1_txt_expDate_popupButton']") 
	public WebElement ExpirationDateClick ; //
	
	@FindBy(xpath=".//*[@id='ctl00_ContentPlaceHolder1_txt_expDate_calendar_Top']/tbody/tr[5]/td[4]/a") 
	public WebElement ExpirationDateSelect; //
	
	@FindBy(xpath=".//*[@id='ContentPlaceHolder1_txt_eventAddress']") 
	public WebElement EventAddress; //

	@FindBy(xpath=".//*[@id='ContentPlaceHolder1_txt_eventCity']") 
	public WebElement EventCity; //

	@FindBy(xpath=".//*[@id='ContentPlaceHolder1_txt_eventState']") 
	public WebElement EventState; //

	@FindBy(xpath=".//*[@id='ContentPlaceHolder1_txt_eventCountry']") 
	public WebElement EventCountry; //

	@FindBy(xpath=".//*[@id='ContentPlaceHolder1_ddlProducts']/option[11]") 
	public WebElement ClientProduct; //

	@FindBy(xpath=".//*[@id='ContentPlaceHolder1_btn_save']") 
	public WebElement LiveEventSave; //
	
	



	
	    public CreateLiveActivity(WebDriver driver) {
	     	this.driver=driver;
		   	PageFactory.initElements(driver, this);
		
	}
		public void create_Activity(String ActivityName,String enterKey,String description,String add,String city,String state,String country) throws InterruptedException, AWTException{
	    	wait_for_element_present(ActivityManagement);
	    	//mouse_hover(ActivityManagement);
	    	ActivityManagement.click();
	    	
	    	CreateAct.click();
	    	wait_for_element_present(LiveEvent);
	    	
	    	LiveEvent.click();
	    	wait_for_element_present(EventTitle);
	    	EventTitle.sendKeys(ActivityName);
	    	
	    	wait_for_element_present(SelectCategory);
	    	SelectCategory.click();
	    	
	    	
	    	
	    	wait_for_element_present(Credits);
	    	Credits.sendKeys(enterKey);
	    	
	    	wait_for_element_present(EventStartDateClick);
	    	EventStartDateClick.click();
	    	
	    	wait_for_element_present(EventStartDateSelect);
	    	EventStartDateSelect.click();
	    
	    	wait_for_element_present(EventEndDateClick);
	    	EventEndDateClick.click();
	    	
	    	wait_for_element_present(EventEndDateSelect);
	    	EventEndDateSelect.click();
	    	
	    	wait_for_element_present(IncludeEvaluation);
	    	IncludeEvaluation.click();
	    	wait_for_element_present(IncludeCertificate);
	    	IncludeCertificate.click();
	    	
	     	wait_for_element_present(ExpirationDateClick);
	     	ExpirationDateClick.click();
	     	
	     	wait_for_element_present(ExpirationDateSelect);
	     	ExpirationDateSelect.click();
	     	wait_for_element_present(EventAddress);
	     	EventAddress.sendKeys(add);
	     	
	     	wait_for_element_present(EventCity);
	     	
	     	EventCity.sendKeys(city);
	     	wait_for_element_present(EventState);
	     	EventState.sendKeys(city);
	     	wait_for_element_present(EventCountry);	
	     	EventCountry.sendKeys(country);
	    	wait_for_element_present(ClientProduct);
	    	ClientProduct.click();
	    	
	    	wait_for_element_present(LiveEventSave);
	    	LiveEventSave.click();
	     	
	
	     	//wait_for_element_present(wb);
	     //	wait_for_element_present(wb);
	    	
	    	
	    	/*Description.sendKeys(description);
	    	wait_for_element_present(Upload_photo);
	    	Upload_photo.click();
	    	file_upload("C:\\Users\\Deepak_143\\Downloads\\baby.jpg");
	    //	C:\Users\Deepak_143\Downloads\baby.jpg
	    	wait_for_element_present(enter_button);
	    	enter_button.click();
	    	wait_for_element_present(Create);
	    	wait_in_seconds(10);
	    	Create.click();
	    	}*/
	}

}
