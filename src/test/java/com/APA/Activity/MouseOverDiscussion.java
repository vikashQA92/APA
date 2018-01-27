package com.APA.Activity;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class MouseOverDiscussion {
	WebDriver driver;
  @Test
  public void login () throws Exception {
	  driver.findElement(By.xpath("//input[@id='email']")).sendKeys("testqa1@yopmail.com");;
	  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Password@12");;
	  driver.findElement(By.xpath("//button[@id='member_login-element-10']")).click();;
	  Thread.sleep(8000);
	  Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("html/body/div[3]/div[2]/header/div[1]/div/div[5]/nav/ul/li[2]/a"))).build().perform();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.gecko.driver", "E:\\library\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get("http://education-psychiatry-qc.astutetech.com/Admin/Account/Login");
	//Author:- VikashGupta  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
