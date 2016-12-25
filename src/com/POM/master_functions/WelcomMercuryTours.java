package com.POM.master_functions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomMercuryTours 
{
  @FindBy(linkText="SIGN-ON")
  WebElement signon;
  public void signon()
  {
	  signon.click();
  }
	
  @FindBy(linkText="REGISTER")
  WebElement register;
  public void register()
  {
	  register.click();
  }
  
  @FindBy(linkText="SUPPORT")
  WebElement support;
  public void support()
  {
	  support.click();
  }
  

  @FindBy(linkText="CONTACT")
  WebElement contact;
  public void contact()
  {
	  contact.click();
  }
  

  @FindBy(name="userName")
  WebElement username;
  

  @FindBy(name="password")
  WebElement password;
  
  @FindBy(name="login")
  WebElement loginbtn;
  
  public void loginTest()
  {
	  username.sendKeys("kumar");
	  password.sendKeys("12345");
	  loginbtn.click();
  }
  

  @FindBy(linkText="your destination")
  WebElement destination;
  public void destination()
  {
	  destination.click();
  }
  

  @FindBy(linkText="featured vacation destinations")
  WebElement vactiondes;
  public void vactiondes()
  {
	  vactiondes.click();
  }
  

  @FindBy(linkText="Register                      here")
  WebElement registerhere;
  public void  registerhere()
  {
	  registerhere.click();
  }
  

  @FindBy(linkText="Business                      Travel @ About.com")
  WebElement bussineslink;
  public void bussineslink()
  {
	  bussineslink.click();
  }
  
  
  @FindBy(linkText="Home")
  WebElement home;
  public void home()
  {
	  home.click();
  }
  
  @FindBy(linkText="Flights")
  WebElement flights;
  public void flights()
  {
	  flights.click();
  }
  
  @FindBy(linkText="Hotels")
  WebElement hotels;
  public void hotels()
  {
	  hotels.click();
  }
  
  @FindBy(linkText="Car Rentals")
  WebElement carRentals;
  public void carRentals()
  {
	  carRentals.click();
  }
  
  @FindBy(linkText="Cruises")
  WebElement cruises;
  public void cruises()
  {
	  cruises.click();
  }
  
  @FindBy(linkText="Destinations")
  WebElement destinations;
  public void destinations()
  {
	  destinations.click();
  }
  
  @FindBy(linkText="Vacations")
  WebElement vacations;
  public void vacations()
  {
	  vacations.click();
  }
  
  
  
}
