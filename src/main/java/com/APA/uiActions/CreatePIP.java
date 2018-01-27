package com.APA.uiActions;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.APA.testBase.TestBase;

public class CreatePIP extends TestBase{
	
	
		WebDriver driver;
		public static final Logger log=Logger.getLogger(HomePage.class.getName());
		
		         //   @FindBy(xpath=".//*[@id='dashBoard']/span")
		          //  public WebElement dashboard;
		@FindBy(xpath=".//*[@id='side-menu']/li[4]/a")
		public WebElement ActivityManagement;        //WebElement and Xpath for .
		
		@FindBy(xpath=".//*[@id='side-menu']/li[4]/ul/li[2]/a[1]") 
		public WebElement CreateAct; //
		
		@FindBy(xpath=".//*[@id='Content1']/div[2]/div[2]/div/div[2]/p[1]/a[1]") 
		public WebElement groupClickNew; //
		
		@FindBy(xpath=".//*[@id='ContentPlaceHolder1_txt_ceofferingTitle']") 
		public WebElement Title; //
		
		@FindBy(xpath=".//*[@id='ContentPlaceHolder1_drpCourseFormat']/option[3]") 
		public WebElement CourseFormate; //
		
		@FindBy(xpath=".//*[@id='ctl00_ContentPlaceHolder1_txt_credits_text']") 
		public WebElement Credits; //
		
		@FindBy(xpath=".//*[@id='ctl00_ContentPlaceHolder1_txt_releaseDate_popupButton']") 
		public WebElement ReleaseDateClick ; //
		
		@FindBy(xpath=".//*[@id='ctl00_ContentPlaceHolder1_txt_releaseDate_calendar_Top']/tbody/tr[1]/td[3]/a") 
		public WebElement ReleaseDateSelect; //
		
		@FindBy(xpath=".//*[@id='ctl00_ContentPlaceHolder1_txt_expDate_popupButton']") 
		public WebElement ExpirationDateClick; //
		
		@FindBy(xpath=".//*[@id='ctl00_ContentPlaceHolder1_txt_expDate_calendar_Top']/tbody/tr[3]/td[4]/a") 
		public WebElement ExpirationDateSelect; 
		
		@FindBy(xpath=".//*[@id='ContentPlaceHolder1_cb_hasEval']") 
		public WebElement IncludeEvaluation; //
		
		@FindBy(xpath=".//*[@id='ContentPlaceHolder1_cb_hasCertificate']") 
		public WebElement IncludeCertificate; //
		
		@FindBy(xpath=".//*[@id='ContentPlaceHolder1_ddlProducts']/[8]") 
		public WebElement ClientProduct; //
		
		@FindBy(xpath=".//*[@id='ContentPlaceHolder1_ddl_ActivityType']/[2]") 
		public WebElement ActivityType; //
		
		@FindBy(xpath=".//*[@id='ContentPlaceHolder1_btn_save']") 
		public WebElement PIPSave; //
		
		
		 public CreatePIP(WebDriver driver) {
		     	this.driver=driver;
			   	PageFactory.initElements(driver, this);
			
		}
}

