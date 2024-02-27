package com.utility;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtility {
	
	public static String getTestData(int rowNumber, int cellNumber) throws InvalidFormatException, IOException {
		//steps to read data from excel
		//create File class object - this refers to excel file
		File file = new File("C:\\Users\\HOME\\Desktop\\JavaSeleniumTrainingWorkSpace\\TestData.xlsx");
		//create workbook object
		XSSFWorkbook book = new XSSFWorkbook(file);
		//create Sheet object
		XSSFSheet sheet = book.getSheetAt(0);
		//Specify the row and cell number
		return sheet.getRow(rowNumber).getCell(cellNumber).getStringCellValue();
	}
	
}
