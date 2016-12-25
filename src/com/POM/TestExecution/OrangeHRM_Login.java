package com.POM.TestExecution;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.POM.master_functions.Homepage_HRM;

public class OrangeHRM_Login {
  @Test
  public void loginTest() throws Exception 
  {
	
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://professional.demo.orangehrmlive.com/");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	 Homepage_HRM  Hrm= PageFactory.initElements(driver,Homepage_HRM.class);
	 Hrm.loginTest();
	 System.out.println("login into account");
  }
}
