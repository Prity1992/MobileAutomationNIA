package com.aqm.staf.framework.core.devices;

import java.io.BufferedReader;
import java.io.File;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import com.google.gson.Gson;
import org.apache.commons.io.FileUtils;

public class jsonToExcel {

	public static StringBuilder[][] jsonToArrayTable(File jsonPath) throws IOException{
		 
		
		String [] fileExt = {"json"};
		Iterator<File> AllJsonFiles = FileUtils.iterateFiles(jsonPath, fileExt, false);
		
		while(AllJsonFiles.hasNext()){
			File jsonFileInProcess  = AllJsonFiles.next();
			FileReader fr = new FileReader(jsonFileInProcess);
			BufferedReader br = new BufferedReader(fr);
			String jsonObject = br.readLine();
			String deviceInfoLine=jsonObject;
			
			Gson gson = new Gson();
			DeviceInfo device = gson.fromJson(deviceInfoLine,DeviceInfo.class);
			DeviceCollection.getInstance().addIntoDeviceCollection(device);
		}
		
		return DeviceStringGen.DeviceInfoInStringBuilder(DeviceCollection.getListOfAllDeviceInfo());
	}
	


}
