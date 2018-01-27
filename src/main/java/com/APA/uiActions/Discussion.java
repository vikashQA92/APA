package com.APA.uiActions;

import java.awt.AWTException;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.APA.testBase.TestBase;

public class Discussion extends TestBase{
	WebDriver driver;
    public static final Logger log=Logger.getLogger(AdminDashboardPage.class.getName());
    
    @FindBy(xpath="html/body/div[3]/div[2]/header/div[1]/div/div[5]/nav/ul/li[2]/a")
  //  html/body/div[3]/div[2]/header/div[1]/div/div[5]/nav/ul/li[2]/a
	 WebElement discussion;
    
    @FindBy(xpath="html/body/div[3]/div[2]/header/div[1]/div/div[5]/nav/ul/li[2]/ul/li[1]/a")
     WebElement CreateDiscussion;
    
    @FindBy(xpath=".//*[@id='Title']")
     WebElement DiscussionTitle;
    
    @FindBy(xpath=".//*[@id='postDiscussionForm']/div/div[2]/div/div[3]/div/span/span/span/span")
     WebElement SelectCategory;
    
    @FindBy(xpath=".//*[@id='categorys-list']")
     List<WebElement> Category_List;
    
    @FindBy (xpath=".//*[@id='categorys_listbox']/li[1]")
     WebElement finance;
    
   @FindBy (xpath=".//*[@id='smarttag']")
   WebElement enterKeyword;
   
   @FindBy (xpath=".//*[@id='question']")
   WebElement Description;
   
   @FindBy (xpath=".//*[@id='submitButton']")
   WebElement Create;
    
   @FindBy (xpath=".//*[@id='postDiscussionForm']/div/div[1]/div/div[2]/button")
   WebElement Upload_photo;
   
   @FindBy(xpath="html/body/footer/div/div[2]/div/div/div/div/div[3]/button[3]")
   WebElement enter_button;
   
  public Discussion(WebDriver driver)
   {
   	this.driver=driver;
   	PageFactory.initElements(driver, this);
   }
    public void create_discussion(String titleName,String enterKey,String description) throws InterruptedException, AWTException{
    	wait_for_element_present(discussion);
    	mouse_hover(discussion);
    	
    	
    	CreateDiscussion.click();
    	wait_for_element_present(DiscussionTitle);
    	DiscussionTitle.sendKeys(titleName);
    	
    	wait_for_element_present(SelectCategory);
    	SelectCategory.click();
    	bootstrap_dropdown(Category_List, "Servcorp News");
    	
    	wait_for_element_present(enterKeyword);
    	enterKeyword.sendKeys(enterKey);
    	wait_for_element_present(Description);
    	Description.sendKeys(description);
    	wait_for_element_present(Upload_photo);
    	Upload_photo.click();
    	file_upload("C:\\Users\\Deepak_143\\Downloads\\baby.jpg");
    //	C:\Users\Deepak_143\Downloads\baby.jpg
    	wait_for_element_present(enter_button);
    	enter_button.click();
    	wait_for_element_present(Create);
    	wait_in_seconds(10);
    	Create.click();
    	}
}
