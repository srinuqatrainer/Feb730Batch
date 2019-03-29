package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_MultipleTestData {

	public static void main(String[] args) throws IOException {
		
FileInputStream file = new FileInputStream("./src/com/ExcelTestDataFiles/MultipleTestData.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		// Identifying the total number of active row's with the Test data
		int rowCount=sheet.getLastRowNum();
		
		for(int i=0;i<=rowCount;i++) // to goto all the active Row's
		{
			Row r=sheet.getRow(i); // Going to a particular row in the Sheet
			
int cellCount=r.getLastCellNum();//In the active row,identifying total number of active Cells with data 
			
			for(int k=0;k<cellCount;k++) // Going to all the active Row's of all the Cell's
			{
				Cell c=r.getCell(k); // goes to an active row of a cell
				String data=c.getStringCellValue(); // getting the String Value
				System.out.print(data+" "); // Printing the value
			}
			System.out.println();
		}
	}

}
