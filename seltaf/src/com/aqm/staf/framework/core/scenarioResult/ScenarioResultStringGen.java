package com.aqm.staf.framework.core.scenarioResult;

import java.util.ArrayList;

public class ScenarioResultStringGen {

	public static ArrayList<ArrayList<String>> ResultSetInStringList(ArrayList<ScenarioResultObject> resCollection){
		ArrayList<ArrayList<String>> allResultLinesData = new ArrayList<ArrayList<String>>(); 
		
		for(ScenarioResultObject sceneResult:resCollection){
			ArrayList<String> listOfLineData = new ArrayList<String>();
			
			listOfLineData.add(sceneResult.getSerialNumber());
			listOfLineData.add(sceneResult.getExecutionTestSuite_TestSuiteReference());
			listOfLineData.add(sceneResult.getScenarioID());
			listOfLineData.add(sceneResult.getExecutionTestScenario_Description());
			listOfLineData.add(sceneResult.getNodeMachineIP());
			listOfLineData.add(sceneResult.getDeviceName());
			listOfLineData.add(sceneResult.getUdidAsPerADB());
			listOfLineData.add(sceneResult.getDeviceManufacturer());
			listOfLineData.add(sceneResult.getDeviceModel());
			listOfLineData.add(sceneResult.getDeviceOS());
			listOfLineData.add(sceneResult.getOSVersion());
			listOfLineData.add(sceneResult.getDeviceType());
			listOfLineData.add(sceneResult.getDateTimeOfExecution());
			listOfLineData.add(sceneResult.getDurationOfExecution());
			listOfLineData.add(sceneResult.getScenarioStatus());
			listOfLineData.add(sceneResult.getReasonIfFailed());
			listOfLineData.add(sceneResult.getTypeOfFailure());


			allResultLinesData.add(listOfLineData);
		}
		
		return allResultLinesData;
	}
	
	public static StringBuilder[][] ResultSetInStringBuilder(ArrayList<ScenarioResultObject> resCollection){
 			int sizeOfSROList=resCollection.size();
		int innerLoopCounter=0;
		StringBuilder[][] allResultLinesData = new StringBuilder[sizeOfSROList][17];
		
		 
		
		for(ScenarioResultObject sceneResult:resCollection){
			
			
				allResultLinesData[innerLoopCounter][0]=	new StringBuilder(sceneResult.getSerialNumber());
				allResultLinesData[innerLoopCounter][1]=	new StringBuilder(sceneResult.getExecutionTestSuite_TestSuiteReference());
				allResultLinesData[innerLoopCounter][2]=	new StringBuilder(sceneResult.getScenarioID());
				allResultLinesData[innerLoopCounter][3]=	new StringBuilder(sceneResult.getExecutionTestScenario_Description());
				allResultLinesData[innerLoopCounter][4]=	new StringBuilder(sceneResult.getNodeMachineIP());
				allResultLinesData[innerLoopCounter][5]=	new StringBuilder(sceneResult.getDeviceName());
				allResultLinesData[innerLoopCounter][6]=	new StringBuilder(sceneResult.getUdidAsPerADB());
				allResultLinesData[innerLoopCounter][7]=	new StringBuilder(sceneResult.getDeviceManufacturer());
				allResultLinesData[innerLoopCounter][8]=	new StringBuilder(sceneResult.getDeviceModel());
				allResultLinesData[innerLoopCounter][9]=	new StringBuilder(sceneResult.getDeviceOS());
				allResultLinesData[innerLoopCounter][10]=	new StringBuilder(sceneResult.getOSVersion());
				allResultLinesData[innerLoopCounter][11]=	new StringBuilder(sceneResult.getDeviceType());
				allResultLinesData[innerLoopCounter][12]=	new StringBuilder(sceneResult.getDateTimeOfExecution());
				allResultLinesData[innerLoopCounter][13]=	new StringBuilder(sceneResult.getDurationOfExecution());
				allResultLinesData[innerLoopCounter][14]=	new StringBuilder(sceneResult.getScenarioStatus());
				allResultLinesData[innerLoopCounter][15]=	new StringBuilder(sceneResult.getReasonIfFailed());
				allResultLinesData[innerLoopCounter][16]=	new StringBuilder(sceneResult.getTypeOfFailure());
				
				
					
	
			innerLoopCounter++;
		}
		
		return allResultLinesData;
	}
	
	
}
