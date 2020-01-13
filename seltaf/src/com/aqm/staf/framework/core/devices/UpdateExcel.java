package com.aqm.staf.framework.core.devices;

import java.io.File;
import java.io.IOException;

public class UpdateExcel {

	public UpdateExcel() {
		
	}

	public static void main(String[] args) throws IOException {
		SheetWriter updateExcel = new SheetWriter();
		String MasterTestSuiteWorkBookPath = "D:\\MobileBaseProjectExcelData\\0000_MasterTestSuite.xlsx";
		String SheetName = "DevicePool";
		String targetJsonFolder = "D:\\MobileBaseProjectRepository\\Grid\\Connected_Devices";
		File jsonFolder = new File(targetJsonFolder); 
		StringBuilder[][] table = jsonToExcel.jsonToArrayTable(jsonFolder);
		String[] headerString = {"NodeMachineIP","HubMachineIP","deviceName","udidAsPerADB","DeviceManufacturer","DeviceModel","DeviceOS","OSVersion","DeviceType","UseForExecution"};
		Boolean status = updateExcel.edXlsx(MasterTestSuiteWorkBookPath,SheetName, headerString,table);
		if(status){
			System.out.println("Excel has been updated Sucessfully !");
		}
		
	}

}
