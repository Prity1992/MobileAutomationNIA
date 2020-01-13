package com.aqm.externalJar.node;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ConfigJsonCreator {
	

	public void createJson(ArrayList<StringBuilder> dataRow,File nodeFile) throws IOException{
		
		String DeviceManufacturer=dataRow.get(5).toString();
		String DeviceModel=dataRow.get(6).toString();;
		String DeviceOS=dataRow.get(7).toString();;
		String OSVersion=dataRow.get(8).toString();;
		String DeviceType=dataRow.get(9).toString();;
		String deviceName=dataRow.get(3).toString();;
		String hubURL=dataRow.get(2).toString();;
		
		

		FileWriter nodeConfigWriter = new FileWriter(nodeFile);
		BufferedWriter nodeConfigBufferedWriter = new BufferedWriter(nodeConfigWriter);
		nodeConfigBufferedWriter.write("{");
		nodeConfigBufferedWriter.newLine();
		nodeConfigBufferedWriter.write("\"capabilities\":");
		nodeConfigBufferedWriter.newLine();
		nodeConfigBufferedWriter.write("[");
		nodeConfigBufferedWriter.newLine();
		nodeConfigBufferedWriter.write("{");
		nodeConfigBufferedWriter.newLine();
		nodeConfigBufferedWriter.write("\"DeviceManufacturer\":\""+DeviceManufacturer+"\",");
		nodeConfigBufferedWriter.newLine();
		nodeConfigBufferedWriter.write("\"DeviceModel\":\""+DeviceModel+"\",");
		nodeConfigBufferedWriter.newLine();
		nodeConfigBufferedWriter.write("\"DeviceOS\":\""+DeviceOS+"\",");
		nodeConfigBufferedWriter.newLine();
		nodeConfigBufferedWriter.write("\"OSVersion\":\""+OSVersion+"\",");
		nodeConfigBufferedWriter.newLine();
		nodeConfigBufferedWriter.write("\"DeviceType\":\""+DeviceType+"\",");
		nodeConfigBufferedWriter.newLine();
		nodeConfigBufferedWriter.write("\"deviceName\":\""+deviceName+"\",");
		nodeConfigBufferedWriter.newLine();
		nodeConfigBufferedWriter.write("\"browserName\":\""+DeviceType+"_"+DeviceManufacturer+"_"+DeviceModel+"_"+DeviceOS+"_"+OSVersion+"\",");
		nodeConfigBufferedWriter.newLine();
		nodeConfigBufferedWriter.write("\"platform\":\""+DeviceOS+"\"");
		nodeConfigBufferedWriter.newLine();
		nodeConfigBufferedWriter.write("}],");
		nodeConfigBufferedWriter.newLine();
		nodeConfigBufferedWriter.write("\"configuration\":");
		nodeConfigBufferedWriter.newLine();
		nodeConfigBufferedWriter.write("{");
		nodeConfigBufferedWriter.newLine();
		nodeConfigBufferedWriter.write("\"nodeTimeout\":120,");
		nodeConfigBufferedWriter.newLine();
		nodeConfigBufferedWriter.write("\"port\":4723,");
		nodeConfigBufferedWriter.newLine();
		nodeConfigBufferedWriter.write("\"hubPort\":4444,");
		nodeConfigBufferedWriter.newLine();
		nodeConfigBufferedWriter.write("\"proxy\": \"org.openqa.grid.selenium.proxy.DefaultRemoteProxy\",");
		nodeConfigBufferedWriter.newLine();
		nodeConfigBufferedWriter.write("\"url\":\"http://"+hubURL+":4723/wd/hub\",");
		nodeConfigBufferedWriter.newLine();
		nodeConfigBufferedWriter.write("\"hub\": \""+hubURL+":4444/grid/register\",");
		nodeConfigBufferedWriter.newLine();
		nodeConfigBufferedWriter.write("\"hubHost\":\""+hubURL+"\",");
		nodeConfigBufferedWriter.newLine();
		nodeConfigBufferedWriter.write("\"nodePolling\":2000,");
		nodeConfigBufferedWriter.newLine();
		nodeConfigBufferedWriter.write("\"registerCycle\":10000,");
		nodeConfigBufferedWriter.newLine();
		nodeConfigBufferedWriter.write("\"register\":true,");
		nodeConfigBufferedWriter.newLine();
		nodeConfigBufferedWriter.write("\"cleanUpCycle\":2000,");
		nodeConfigBufferedWriter.newLine();
		nodeConfigBufferedWriter.write("\"timeout\":30000,");
		nodeConfigBufferedWriter.newLine();
		nodeConfigBufferedWriter.write("\"maxSession\":5");
		nodeConfigBufferedWriter.newLine();
		nodeConfigBufferedWriter.write("}");
		nodeConfigBufferedWriter.newLine();
		nodeConfigBufferedWriter.write("}");
		nodeConfigBufferedWriter.flush();
		
		}}