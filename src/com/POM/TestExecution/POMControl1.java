package com.POM.TestExecution;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.POM.master_functions.RegisterMercuryTours1;
import com.POM.master_functions.RegisterMercuryTours2;
import com.POM.master_functions.WelcomMercuryTours;

public class POMControl1 {
	WebDriver driver;
  @Test
  public void pomTest1() throws IOException, Exception 
  {
	  FileInputStream f=new FileInputStream("C:\\Users\\Bujji24\\workspace3\\POM\\src\\com\\POM\\Testdata\\Datadriventesting.xlsx");
	    @SuppressWarnings("resource")
		
	    XSSFWorkbook wb=new XSSFWorkbook(f);
	    XSSFSheet ws=wb.getSheet("Sheet3");
	 
	  driver=new FirefoxDriver();
	  driver.get("http://newtours.demoaut.com");
	  driver.manage().window().maximize();
	  Thread.sleep(5000);
	  
	  
	  WelcomMercuryTours wm=PageFactory.initElements(driver,WelcomMercuryTours.class);
	  RegisterMercuryTours1 rm1= PageFactory.initElements(driver,RegisterMercuryTours1.class);
	  RegisterMercuryTours2 rm2=PageFactory.initElements(driver,RegisterMercuryTours2.class);
	  
	  wm.register();
	  Thread.sleep(3000);
	  Iterator<Row> row=ws.iterator();
	  row.next();
	  while (row.hasNext())
	  {
		  Row r=row.next();
		  rm1.contactRegistration(r);
		  Thread.sleep(3000);
		boolean text=  rm2.validateTesting(r.getCell(9).getStringCellValue());
		if (text==true)
		{
		  r.createCell(12).setCellValue("Passed");	
		}
		else
		{
		  r.createCell(12).setCellValue("Failed");	
		}
		driver.navigate().back();
	}
	  
	  FileOutputStream f1=new FileOutputStream("C:\\Users\\Bujji24\\workspace3\\POM\\src\\com\\POM\\Testdata\\DatadriventPom.xlsx");
	  wb.write(f1);
	  f1.close();
  
  }
}
