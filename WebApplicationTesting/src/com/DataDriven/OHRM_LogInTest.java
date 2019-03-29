package com.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class OHRM_LogInTest extends BaseTest
{
	
	@Test
	public void logIn() throws InterruptedException, IOException
	{
	FileInputStream file=new FileInputStream("./src/com/ApplicationTestDataFiles/"
			                                            + "OHRM_LogIn_MultipleTestData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		int rowsCount=sheet.getLastRowNum();
		Row r = null;
		
		for(int i=1;i<=rowsCount;i++)
		{
			
		 r=sheet.getRow(i);
		driver.findElement(By.id("txtUsername")).sendKeys(r.getCell(0).getStringCellValue());
		driver.findElement(By.id("txtPassword")).sendKeys(r.getCell(1).getStringCellValue());
		driver.findElement(By.id("btnLogin")).click();
		
	try
	{
		String expected_LoginText = "Welcome";
		System.out.println(expected_LoginText);
		
		WebElement actual_LogInTextElement =driver.findElement(By.linkText("Welcome Admin"));
		String actual_LogInText=actual_LogInTextElement.getText();
		
		System.out.println(actual_LogInText);
		
		if(actual_LogInText.contains(expected_LoginText))
		{
			System.out.println("OrangeHRM Login Successful -PASS");
			r.createCell(2).setCellValue("OrangeHRM Login Successful -PASS");
			
			actual_LogInTextElement.click();
			
			Thread.sleep(5000);
			
			driver.findElement(By.linkText("Logout")).click();
			
		}
	}
	catch(Exception e)
		{
		   String expected_LogInError_AlertText="Invalid credentials";
	System.out.println(" The exception Error text message is : "+expected_LogInError_AlertText);
		   
		   String actual_LogInError_Text =driver.findElement(By.id("spanMessage")).getText(); 
		   System.out.println("The actual Error text is :" +actual_LogInError_Text);
		   
		   if(actual_LogInError_Text.equals(expected_LogInError_AlertText))
		   {
			    System.out.println("OHRM LogIn Failed - FAIL");
			    r.createCell(2).setCellValue("OHRM LogIn Failed - FAIL");
			
			    File screenshots=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   FileUtils.copyFile(screenshots, new File("./Screenshots/"+i+"_Iteration_errorLogIn"+".png"));
		   }
		 }
		   
		
FileOutputStream file1=new FileOutputStream("./src/com/ApplicationTestResultFiles"
		+ "/OHRM_LogIn_TestResult.xlsx");
		workbook.write(file1);
	}


	}
}

