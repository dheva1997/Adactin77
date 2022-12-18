package com;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {

	public static void AllData() throws IOException {

		File f = new File(".\\Excelfile\\sathya.xlsx");

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		wb.createSheet("new").createRow(0).createCell(0).setCellValue("UserName");

		wb.getSheet("new").getRow(0).createCell(1).setCellValue("PassWord");

		wb.getSheet("new").createRow(1).createCell(0).setCellValue("SATHIYA");

		wb.getSheet("new").getRow(1).createCell(1).setCellValue("Sathiya@77");

		FileOutputStream fos = new FileOutputStream(f);

		wb.write(fos);
		
		System.exit(0);// when the console syso not print the Task Completed.

		System.out.println("Task Completed Sucessfully");

		wb.close();

	}

	public static void main(String[] args) throws IOException {

		AllData();

	}
}