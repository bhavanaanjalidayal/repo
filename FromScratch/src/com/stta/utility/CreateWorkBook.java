package com.stta.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class CreateWorkBook {

	public static File fileOutputStream = null;

	public static void main(String args[]) throws IOException
	{
		String filename = "E:/Book1.xls";
		HSSFWorkbook workbook = new HSSFWorkbook();
		HSSFSheet sheet = workbook.createSheet("Java Excels");
		HSSFRow row = sheet.createRow(3);
		HSSFCell cell = row.createCell(1);
		cell.setCellValue("Have a Cup of XL");
		FileOutputStream output = new FileOutputStream(filename);
		workbook.write(output);
		output.close();
		workbook.close();
		
		HSSFWorkbook workbook1 = new HSSFWorkbook(new FileInputStream(filename));
		
		
		//Connection con = new Connection();
	}
}
