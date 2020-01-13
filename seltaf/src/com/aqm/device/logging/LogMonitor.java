package com.aqm.device.logging;

import java.io.Serializable;

public class LogMonitor implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 4436543274877708208L;
	
	private String NodeMachineIP;
	private String packageName;
	private String deviceID;
	private String rootFolderPath;
	

	public String getNodeMachineIP() {
		return NodeMachineIP;
	}
	public void setNodeMachineIP(String nodeMachineIP) {
		NodeMachineIP = nodeMachineIP;
	}
	public String getPackageName() {
		
		return "\""+packageName+"\"";
	}
	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}
	public String getDeviceID() {
		return deviceID;
	}
	public void setDeviceID(String deviceID) {
		this.deviceID = deviceID;
	}
	public String getRootFolderPath() {
		return rootFolderPath;
	}
	public void setRootFolderPath(String rootFolderPath) {
		this.rootFolderPath = rootFolderPath;
	}
	
	
}
