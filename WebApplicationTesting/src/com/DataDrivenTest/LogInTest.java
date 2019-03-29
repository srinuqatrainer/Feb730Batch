package com.DataDrivenTest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.testng.annotations.Test;



public class LogInTest extends BaseTest {
	
	
	@Test
	public void logIn() throws IOException
	{
		FileInputStream file = new FileInputStream("./src/com/ApplicationTestDataFiles/NewTours_MultipleLogInTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("02March");
		
		int rowsCount=sheet.getLastRowNum();
		
		for(int i=1;i<=rowsCount;i++)
		{
			Row r=sheet.getRow(i);
			driver.findElement(By.name("userName")).sendKeys(r.getCell(0).getStringCellValue());
			
			// <input type="password" name="password" size="10">
			
			driver.findElement(By.name("password")).sendKeys(r.getCell(1).getStringCellValue());
			
			// <input type="image" name="login" value="Login" src="/images/btn_signin.gif" width="58" height="17" alt="Sign-In" border="0">
			
			driver.findElement(By.name("login")).click();
			
			String expected_Title="Find";
			System.out.println(" The expected title after logIn is :"+expected_Title);
			
			String actual_Title=driver.getTitle();
			System.out.println(" The actual title after logIn is : "+actual_Title);
			
			if(actual_Title.contains(expected_Title))
			{
				System.out.println(" LogIn Successfull - PASS");
				r.createCell(2).setCellValue("LogIn Successfull - PASS");
			}
			else
			{
				System.out.println(" LogIN Failed - FAIL");
				r.createCell(2).setCellValue("LogIN Failed - FAIL");
			}
			
			FileOutputStream file1 = new FileOutputStream
					("./src/com/ApplicationTestResultFiles/NewTours_TestResult_MultipleTestData.xlsx");
			workBook.write(file1);
			
			driver.navigate().back();
		}
	}
	
	

}
