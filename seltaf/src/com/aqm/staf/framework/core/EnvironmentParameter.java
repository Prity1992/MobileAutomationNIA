package com.aqm.staf.framework.core;

public class EnvironmentParameter {
    private String NodeMachineIP;
    private String deviceName;
    private String udidAsPerADB;
    private String DeviceManufacturer;
    private String DeviceModel;
    private String DeviceOS;
    private String OSVersion;
    private String DeviceType;
    
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
}
