package com.POM;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class NewTours_WelComeMercuryTours extends BaseTest {
	
	// Test case Class
	
	@Test
	public void homePage() throws IOException
	{
		
		WelComeMercuryTours wmt = PageFactory.initElements(driver, WelComeMercuryTours.class);
			
		wmt.signOn();
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		driver.navigate().back();
		
		wmt.register();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		driver.navigate().back();
		
		wmt.support();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println();
		driver.navigate().back();
		
		FileInputStream file = new FileInputStream("./src/com/ApplicationTestDataFiles/NewTours_MultipleLogInTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("02March");
		
		int rowCount=sheet.getLastRowNum();
		
		for(int i=1;i<=rowCount;i++)
			
		{
			Row r=sheet.getRow(i);
			
			String u=r.getCell(0).getStringCellValue();
			System.out.println("The value of UserName is :"+u);
			
			wmt.logIn(r.getCell(0).getStringCellValue(), r.getCell(1).getStringCellValue());
			
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
			
			FileOutputStream file1 = new FileOutputStream("./src/com/ApplicationTestResults/NewTours_LogInTestResult.xlsx");
			workBook.write(file1);
					
			driver.navigate().back();
		}
				
		
	}

}
