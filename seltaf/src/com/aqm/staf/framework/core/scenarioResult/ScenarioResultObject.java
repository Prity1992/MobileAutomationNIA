package com.aqm.staf.framework.core.scenarioResult;

import java.io.Serializable;
import java.util.Calendar;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DurationFormatUtils;

public class ScenarioResultObject implements Serializable, Cloneable{

	private static final long serialVersionUID = 1L;
	
	
	private String NodeMachineIP;
	private String deviceName;
	private String udidAsPerADB;
	private String DeviceManufacturer;
	private String DeviceModel;
	private String DeviceOS;
	private String OSVersion;
	private String DeviceType;
	private String executionTestSuite_TestSuiteReference;
	private String executionTestScenario_Description;
	private static Integer serialNumberCounter=0;
	private String serialNumber;
	private String scenarioID;
	private Calendar dateTimeOfExecution;
	private long durationOfExecution;
	private String scenarioStatus;
	private String reasonIfFailed;
	private String typeOfFailure;
	
	public String getNodeMachineIP() {
		return NodeMachineIP;
	}

	public void setNodeMachineIP(String nodeMachineIP) {
		NodeMachineIP = nodeMachineIP;
	}

	public String getDeviceName() {
		return deviceName;
	}

	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}

	public String getUdidAsPerADB() {
		return udidAsPerADB;
	}

	public void setUdidAsPerADB(String udidAsPerADB) {
		this.udidAsPerADB = udidAsPerADB;
	}

	public String getDeviceManufacturer() {
		return DeviceManufacturer;
	}

	public void setDeviceManufacturer(String deviceManufacturer) {
		DeviceManufacturer = deviceManufacturer;
	}

	public String getDeviceModel() {
		return DeviceModel;
	}

	public void setDeviceModel(String deviceModel) {
		DeviceModel = deviceModel;
	}

	public String getDeviceOS() {
		return DeviceOS;
	}

	public void setDeviceOS(String deviceOS) {
		DeviceOS = deviceOS;
	}

	public String getOSVersion() {
		return OSVersion;
	}

	public void setOSVersion(String oSVersion) {
		OSVersion = oSVersion;
	}

	public String getDeviceType() {
		return DeviceType;
	}

	public void setDeviceType(String deviceType) {
		DeviceType = deviceType;
	}




	public String getExecutionTestSuite_TestSuiteReference() {
		return executionTestSuite_TestSuiteReference;
	}

	public void setExecutionTestSuite_TestSuiteReference(String executionTestSuite_TestSuiteReference) {
		this.executionTestSuite_TestSuiteReference = executionTestSuite_TestSuiteReference;
	}

	



	public String getExecutionTestScenario_Description() {
		return executionTestScenario_Description;
	}

	public void setExecutionTestScenario_Description(String executionTestScenario_Description) {
		this.executionTestScenario_Description = executionTestScenario_Description;
	}

	public static Integer generateExecutionSerialNumber(){
		return ++serialNumberCounter;
	}

	public String getSerialNumber() {
		setSerialNumber((ScenarioResultObject.generateExecutionSerialNumber()).toString());
		return serialNumber;
	}
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}


	public String getScenarioID() {
		return scenarioID;
	}
	public void setScenarioID(String scenarioID) {
		this.scenarioID = scenarioID;
	}

	public String getDateTimeOfExecution() {
		String dateFormat = DateFormatUtils.format(dateTimeOfExecution.getTime(), "yyyy-MM-dd HH:mm:ss");
		return dateFormat;
	}
	public void setDateTimeOfExecution(Calendar dateTimeOfExecution) {
		this.dateTimeOfExecution = dateTimeOfExecution;
	}
	public String getDurationOfExecution() {
		return DurationFormatUtils.formatDurationWords(durationOfExecution,true,true);
	}
	public void setDurationOfExecution(long durationOfExecution) {
		this.durationOfExecution = durationOfExecution;
	}
	public String getScenarioStatus() {
		return scenarioStatus;
	}
	public void setScenarioStatus(String scenarioStatus) {
		this.scenarioStatus = scenarioStatus;
	}
	public String getReasonIfFailed() {
		return reasonIfFailed;
	}
	public void setReasonIfFailed(String reasonIfFailed) {
		this.reasonIfFailed = reasonIfFailed;
	}
	public String getTypeOfFailure() {
		return typeOfFailure;
	}
	public void setTypeOfFailure(String typeOfFailure) {
		this.typeOfFailure = typeOfFailure;
	}

}
