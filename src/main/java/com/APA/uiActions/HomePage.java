package com.APA.uiActions;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.APA.testBase.TestBase;

public class HomePage extends TestBase 
{
	WebDriver driver;
    public static final Logger log=Logger.getLogger(HomePage.class.getName());
    
    @FindBy(xpath="//img[@src='/Content/images/menu.png']")
    public WebElement menuicon;        //WebElement and Xpath for Menu dropdown.
    
    @FindBy(xpath="//img[@alt='Servcorp Logo' and @src='/Content/images/logo.svg']")
    public WebElement servcorpimage;   //WebElement and Xpath for Servcorp image.

    @FindBy(xpath="//a[@class='dropdown-toggle ng-binding' and text()='Directory']")
    public WebElement directory;       //WebElement and Xpath for Directory tab
    
    @FindBy(xpath="//a[@class='dropdown-toggle ng-binding' and text()='Discussions']")
    public WebElement discussions;     //WebElement and Xpath for Discussions tab
    
    @FindBy(xpath="//ul[@class='dropdown-menu submenudrodown']//a[@class='ng-binding' and text()='View Discussions']")
    public WebElement viewdiscussions; //WebElement and Xpath for View Discussions in Discussions dropdown
     
    @FindBy(xpath="//ul[@class='dropdown-menu submenudrodown']//a[@class='ng-binding' and text()='My Discussions']")
    public WebElement  mydiscussions;  //WebElement and Xpath for My Discussions in Discussions dropdown
    
    @FindBy(xpath="//a[@class=\"dropdown-toggle ng-binding\" and text()='Events']")
    public WebElement events;          //WebElement and Xpath for Events tab
    
    @FindBy(xpath="//a[@class='dropdown-toggle ng-binding' and text()='Groups']")
    public WebElement groups;          //WebElement and Xpath for Groups tab
    
    @FindBy(xpath="//a[@class='dropdown-toggle ng-binding' and text()='Articles']")
    public WebElement articles;        //WebElement and Xpath for Articles tab
     
    @FindBy(xpath="//input[@type='text' and @placeholder='Search title']")
	
    public WebElement searchtitletextfield; //WebElement and Xpath for Search title text Filed
    
    @FindBy(xpath="//input[@id='autocompleteGoogleAddress2']")
    public WebElement locationtextfield;   //WebElement and Xpath for location text Filed
    
    @FindBy(xpath="//input[@type='text' and @name='industry_input']")
    public WebElement alltextfield;      //WebElement and Xpath for All text Filed
    
    @FindBy(xpath="//div[@class='header_control']//span[@class='k-select' and @unselectable='on']//following::button[1]")
    public WebElement alldropdown;       //WebElement and Xpath for All Dropdown Field
    
    @FindBy(xpath="//button[@type='submit' and text()='Search']")
    public WebElement searchbutton;      //WebElement and Xpath for search button
    
    @FindBy(xpath="//a[@class='btn btn-homeSearch ng-binding ng-scope' and text()='Advance Search']")
    public WebElement advancesearch;   //WebElement and Xpath for advancesearchbutton
    
    @FindBy(xpath="//span[@class='k-input ng-binding ng-scope' and text()='Distance']")
    public WebElement distancedropdown;  //WebElement and Xpath for select distance dropdown
    
    @FindBy(xpath="//ul[@id='shortingddl_listbox']/li")
    public List<WebElement> selectdistance;  //WebElement and Xpath for search distance dropdown
    
    @FindBy(xpath="//span[@class='k-input ng-scope' and text()='Select Servcorp Location City']")
    public WebElement selectservcorpdropdown;  //WebElement and Xpath for search servcorp dropdown
    
    @FindBy(xpath="//ul[@id='servcorp_location_listbox']/li")
    public List<WebElement> selectlocation;;    //WebElement and Xpath for search select location
    
    @FindBy(xpath="//input[@class='btn btn-yellow' and @ng-click='AdvanceFilter()' and @value='Search']")
    public WebElement advancedsearchbutton;
    
    @FindBy(xpath="//button[@type='button' and text()='Clear filter']")
    public WebElement clearfilterbutton;  //WebElement and Xpath for Clear Filter Button
    
    @FindBy(xpath="//div[@class='location_show']//span[@class='ng-binding']")
    public List<WebElement> address;      //WebElement and Xpath for Clear Filter Button
    
    @FindBy(xpath="//div[@class='loadMode endoffeed ng-binding ng-scope' and text()='End of Feed. Nothing to see here.']")
    public WebElement endoffeedtext;      //WebElement and Xpath for End of feed text at the bottom of page
    
    @FindBy(xpath="//li[@id='profileTab']//a[@class='nav-link ng-binding']")
    public WebElement profiletab;         //WebElement and Xpath for profile tab
    
    @FindBy(xpath="//div[@class='serach_pic']//img[@class='ng-isolate-scope' and @err-src='/Images/profile.png']")
    public List<WebElement> profileimages;   //WebElement and Xpath for profile images
    
    @FindBy(xpath="//div[@class='user_name_prf']//a[@href='/home/global/publicindividualprofile/2103276f-1a31-e711-80c8-000d3aa1e60f']")
    public WebElement profilename;          //WebElement and Xpath for profile name
    
    @FindBy(xpath="//i[@class='fa fa-angle-down']//preceding-sibling::span")
    public WebElement languagedropdown;
    
    @FindBy(xpath="//span[text()='Choose Language :']//following::span[1]")
    public WebElement selectlanguagedropdown;
    
    @FindBy(xpath="//div[@class='k-list-scroller']//ul[@class='k-list k-reset']//li//span")
    public List<WebElement> selectlanguage;
    
    /*...................> Method to initialize driver and web elements <..........................*/
   
    public HomePage(WebDriver driver)
	 {
		 this.driver=driver;
		 PageFactory.initElements(driver, this);
	 }
    
    /*...................> Method to click on directory tab <..........................*/
    
    public void click_on_directory()
    {
    	log.info("Clicked on Directory tab and object is "+directory.toString());
    	directory.click();
    }
    
    /*...................> Method to search title name in title name text field <..........................*/
    
    public void search_title(String titlename)
    {
    	log.info("Entered title name " +titlename+ " and object is "+searchtitletextfield.toString());
    	searchtitletextfield.sendKeys(titlename);
    }
    
    /*...................> Method to search location name in location name text field <..........................*/
    
    public void search_location_name(String location)
    {
    	log.info("Entered Location name " +location+ " and object is "+locationtextfield.toString());
    	locationtextfield.sendKeys(location);
    }
    
    /*...................> Method to click on search button <..........................*/
    
    public void click_search_button()
    {
    	log.info("Clicked on Search button and object is "+searchbutton.toString());
    	searchbutton.click();
    }
    
    /*...................> Method to click on advanced search button <..........................*/
    
    public void click_on_advancedsearch()
    {
    	log.info("Clicked on Search button and object is "+advancesearch.toString());
    	advancesearch.click();
    }
    
/*...................> Method to click on advanced search button <..........................*/
    
    public void click_advancedsearch_button()
    {
    	log.info("Clicked on Search button and object is "+advancedsearchbutton.toString());
    	advancedsearchbutton.click();
    }
    
    /*...................> Method to identify the address that entered <..........................*/
    
    public boolean identify_address(String place)
    {
    	
       for(WebElement e : address)
       {
    	   if(e.getText().contains(place))
    	   {
    		  //System.out.println("The identified places are: " +e.getText()); 
    	   }
      }
       return true;
     }
    
    public int verify_profile_images()
    {
    	int count = 0;
    	for(@SuppressWarnings("unused") WebElement img : profileimages)
    	{
    		count=profileimages.size();
    		
    	}
		return count;
    	 
    }
    
    public void click_on_profiletab()
    {
    	profiletab.click();
    }
    
    public boolean verify_profile_name(String profname)
    {
    	if(profilename.getText().contains(profname))
    	{
    		return true;
    	}
    	else
    	{
    		return false;
    	}
    	 
    }
    
     public String end_of_feed()
     {
    	
    	return endoffeedtext.getText();
    	
     }
     
     public void select_distance_and_location() throws InterruptedException
     {
    	wait_for_element_present(distancedropdown);
    	distancedropdown.click();
    	bootstrap_dropdown(selectdistance, "Alphabetical order");
    	wait_for_element_present(selectservcorpdropdown);
    	selectservcorpdropdown.click();
    	bootstrap_dropdown(selectlocation, "Nagoya");
    	wait_for_element_present(advancedsearchbutton);
    	click_advancedsearch_button();
     }
     
     public void select_language() throws InterruptedException
     {
    	 wait_for_element_present(languagedropdown);
    	 languagedropdown.click();
    	 wait_in_seconds(5);
    	 selectlanguagedropdown.click();
    	 wait_in_seconds(5);
    	 bootstrap_dropdown(selectlanguage, "Français");
     }
    
  }
