package com.POM.TestExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class NewTest12 {
  @Test
  public void f() 
  {
	  FirefoxDriver  d=new FirefoxDriver();
	  d.get("http://www.google.com");
	  d.manage().window().maximize();
  }
}
