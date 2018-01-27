package com.APA.uiActions;

import java.awt.AWTException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.APA.testBase.TestBase;

public class EditLiveAct extends TestBase {
	
	WebDriver driver;
	public static final Logger log=Logger.getLogger(HomePage.class.getName());
	
	         //   @FindBy(xpath=".//*[@id='dashBoard']/span")
	          //  public WebElement dashboard;
	@FindBy(xpath=".//*[@id='side-menu']/li[4]/a")
	public WebElement ActivityManagement;        //WebElement and 
	
	@FindBy(xpath=".//*[@id='side-menu']/li[4]/ul/li[3]/a[1]")
	public WebElement EditExistAct;
	
	@FindBy(xpath=".//*[@id='yadcf-filter--tblActivityList-3']")
	public WebElement ActivityType;
	
	@FindBy(xpath=".//*[@id='tblActivityList_paginate']/span/a[6]")
	public WebElement ClickLastBtn;
	
	@FindBy(xpath=".//*[@id='tblActivityList']/tbody/tr[10]/td[5]")
	public WebElement ActivityTitle;
	
	
	
	public EditLiveAct(WebDriver driver) {
     	this.driver=driver;
	   	PageFactory.initElements(driver, this);
	
}
	public void EditLive_Activity(String Activity) throws InterruptedException, AWTException{
    wait_for_element_present(ActivityManagement);
    	//mouse_hover(ActivityManagement);
    	ActivityManagement.click();
    	
    	EditExistAct.click();
    	wait_for_element_present(ActivityType);
    	
    	//ActivityType.click();
    	ActivityType.sendKeys(Activity);
    	
    	wait_for_element_present(ClickLastBtn);
    	ClickLastBtn.click();
    	
    	
    	
    	
    //	wait_for_element_present(EventTitle);
    //	EventTitle.sendKeys(ActivityName);
    	
    //	wait_for_element_present(SelectCategory);
    //	SelectCategory.click();

}
}