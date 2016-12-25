package com.POM.master_functions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterMercuryTours2 
{
   @FindBy(xpath="html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[3]/a/font/b")
   WebElement textmsg;
   public boolean validateTesting(String text)
   {
	  String note= textmsg.getText();
	  if(note.contains(text))
	  {
		  return true;
	  }
	  else
	  {
		  return false;
	  }
   }
}
