package com.POM.master_functions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class Homepage_HRM
{
  @FindBy(id="txtUsername")
  @CacheLookup
  WebElement username;
  
  
  
  @FindBy(id="txtPassword")
  @CacheLookup
  WebElement password;
  
  
  @FindBy(id="btnLogin")
  @CacheLookup
  WebElement loginbtn;
  public void loginTest()
  {
	  username.sendKeys("Admin");
	  password.sendKeys("admin");
	  loginbtn.click();
  }
  
  @FindBy(linkText="         Forgot your password?    ")
  @CacheLookup
  WebElement forgetpwd;
  public void fergetpwd()
  {
	  forgetpwd.click();
  }
	
  
  @FindBy(linkText="OrangeHRM, Inc")
  @CacheLookup
  WebElement hrmlink;
  public void hrmlink()
  {
	  hrmlink.click();
  }
	
}
