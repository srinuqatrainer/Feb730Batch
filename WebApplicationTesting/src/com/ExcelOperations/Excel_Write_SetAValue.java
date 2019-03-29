package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Write_SetAValue {

	public static void main(String[] args) throws IOException {
		
		// Identifying the file on the system
FileInputStream file = new FileInputStream("./src/com/ExcelTestDataFiles/SingleTestData.xlsx");
		// Identifying the WorkBook in the FILE
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		// Identifying a particular Sheet in the WorkBook
		XSSFSheet sheet = workBook.getSheet("Sheet1");
		
		Row r=sheet.createRow(2); // creating a Row in the Sheet
		
		Cell c=r.createCell(3); // Creating a Cell in the Row created
		
		c.setCellValue("Srini"); // setting a Value in the Row of a Cell Created
		
		// Writing the Output to a File
FileOutputStream file1 =new FileOutputStream("./src/com/ExcelTestDataFiles/SingleTestData.xlsx");
		workBook.write(file1); // Saving the WorkBook of an OutPut File

	}

}
