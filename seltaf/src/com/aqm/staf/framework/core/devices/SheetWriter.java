package com.aqm.staf.framework.core.devices;

import java.io.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class SheetWriter {

	public Boolean edXlsx(String workbookPath, String SheetName, String[] headerString, StringBuilder[][] table)
			throws IOException {

		FileInputStream fsIP = new FileInputStream(new File(workbookPath));
		XSSFWorkbook wb = new XSSFWorkbook(fsIP);
		XSSFSheet oldWorksheet = wb.getSheet(SheetName);
		int index = wb.getSheetIndex(oldWorksheet);
		wb.removeSheetAt(index);
		XSSFSheet newWorksheet = wb.createSheet(SheetName);
		wb.setSheetOrder(SheetName, index);
		int rowCounter = 0;

		for (StringBuilder[] eachrow : table) {

			XSSFRow currentRow = newWorksheet.createRow(rowCounter);

			int columnCounter = 0;
			for (StringBuilder deviceInfoColumn : eachrow) {
				XSSFCell currentCell = currentRow.createCell(columnCounter, Cell.CELL_TYPE_STRING);
				currentCell.setCellValue(deviceInfoColumn.toString());
				columnCounter++;
			}

			rowCounter++;

		}
		
		for (int columnnum = 0; columnnum < headerString.length; columnnum++)
		newWorksheet.autoSizeColumn(columnnum);
		

		fsIP.close();
		FileOutputStream output_file = new FileOutputStream(new File(workbookPath));
																						
		wb.write(output_file);
		output_file.close();

		return true;

	}

}
