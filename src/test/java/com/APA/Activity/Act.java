package com.APA.Activity;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class Act {
	WebDriver driver;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "D:\\Workspace\\APA\\drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://education-psychiatry-qc.astutetech.com/Admin/");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath(".//*[@id='UserName']")).sendKeys("vikashgupta1");
	  driver.findElement(By.xpath(".//*[@id='Password']")).sendKeys("T3st@123");
      driver.findElement(By.xpath(".//*[@id='btnLogin']")).click();
      
      
      
  }
  @BeforeTest
  public void beforeTest() {
  }

}
