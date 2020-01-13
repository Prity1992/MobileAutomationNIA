package com.aqm.staf.framework.core.devices;

import java.util.ArrayList;

public class DeviceCollection {
	
	public static DeviceCollection instance=null;
	public static ArrayList<DeviceInfo> listOfAllDeviceInfo;
	
			
			public static ArrayList<DeviceInfo> getListOfAllDeviceInfo() {
					return listOfAllDeviceInfo;
					}

			public DeviceCollection(){
			if(listOfAllDeviceInfo==null){
				listOfAllDeviceInfo= new ArrayList<DeviceInfo>();
			}}
			
			public static DeviceCollection getInstance(){
				if(instance==null){
					instance=new DeviceCollection();
					return instance;
				}
				else{
					return instance;
				}
			}
			
			public Boolean addIntoDeviceCollection(DeviceInfo obj){
				if(obj instanceof DeviceInfo){
				return listOfAllDeviceInfo.add(obj);
				}
				return false;
			}
		
			
			
			
}
