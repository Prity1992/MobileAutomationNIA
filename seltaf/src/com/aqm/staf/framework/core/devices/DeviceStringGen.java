package com.aqm.staf.framework.core.devices;

import java.util.ArrayList;

public class DeviceStringGen {
	
	public static StringBuilder[][] DeviceInfoInStringBuilder(ArrayList<DeviceInfo> devCollection){
		int sizeOfDevicesList=devCollection.size()+1;
		int innerLoopCounter = 0;
		
		StringBuilder[][] allDeviceInfoLinesData = new StringBuilder[sizeOfDevicesList][10];
		
		allDeviceInfoLinesData[innerLoopCounter][0]=	new StringBuilder("NodeMachineIP");
		allDeviceInfoLinesData[innerLoopCounter][1]=	new StringBuilder("HubMachineIP");
		allDeviceInfoLinesData[innerLoopCounter][2]=	new StringBuilder("DeviceName");
		allDeviceInfoLinesData[innerLoopCounter][3]=	new StringBuilder("UdidAsPerADB");
		allDeviceInfoLinesData[innerLoopCounter][4]=	new StringBuilder("DeviceManufacturer");
		allDeviceInfoLinesData[innerLoopCounter][5]=	new StringBuilder("DeviceModel");
		allDeviceInfoLinesData[innerLoopCounter][6]=	new StringBuilder("DeviceOS");
		allDeviceInfoLinesData[innerLoopCounter][7]=	new StringBuilder("OSVersion");
		allDeviceInfoLinesData[innerLoopCounter][8]=	new StringBuilder("DeviceType");
		allDeviceInfoLinesData[innerLoopCounter][9]=	new StringBuilder("UseForExecution");
		
		innerLoopCounter++;
		
		for(DeviceInfo device:devCollection){
			
			allDeviceInfoLinesData[innerLoopCounter][0]=	new StringBuilder(device.getNodeMachineIP());
			allDeviceInfoLinesData[innerLoopCounter][1]=	new StringBuilder(device.getHubMachineIP());
			allDeviceInfoLinesData[innerLoopCounter][2]=	new StringBuilder(device.getDeviceName());
			allDeviceInfoLinesData[innerLoopCounter][3]=	new StringBuilder(device.getUdidAsPerADB());
			allDeviceInfoLinesData[innerLoopCounter][4]=	new StringBuilder(device.getDeviceManufacturer());
			allDeviceInfoLinesData[innerLoopCounter][5]=	new StringBuilder(device.getDeviceModel());
			allDeviceInfoLinesData[innerLoopCounter][6]=	new StringBuilder(device.getDeviceOS());
			allDeviceInfoLinesData[innerLoopCounter][7]=	new StringBuilder(device.getOSVersion());
			allDeviceInfoLinesData[innerLoopCounter][8]=	new StringBuilder(device.getDeviceType());
			allDeviceInfoLinesData[innerLoopCounter][9]=	new StringBuilder("Yes");

			innerLoopCounter++;
		}
		
		return allDeviceInfoLinesData;
	}
	
	
}
