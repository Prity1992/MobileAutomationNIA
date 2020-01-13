package com.aqm.staf.framework.core.scenarioResult;

public class WriteScenarioResultInExcel {
	
	public WriteScenarioResultInExcel(String workbookName,String filepath,StringBuilder[][] table){
		String headerLine[]={"serialNumber","executionTestSuite_TestSuiteReference","scenarioID","executionTestScenario_Description","NodeMachineIP","deviceName","udidAsPerADB","DeviceManufacturer","DeviceModel","DeviceOS","OSVersion","DeviceType","dateTimeOfExecution","durationOfExecution","scenarioStatus","reasonIfFailed","typeOfFailure"};
		WorkbookBuilder generateExcelResult = new WorkbookBuilder();
		generateExcelResult.mkXlsx(workbookName, filepath, headerLine, table);
	}


	

	
}
