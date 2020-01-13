package com.aqm.externalExecutable.Hub;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;



public class HubCreator {
	
	Properties prop;
	
	public void loadProperties() throws IOException {
		InputStream input;
		Properties ConfigProp;
		InputStream ConfigInput;
		
		prop = new Properties();
		input = new FileInputStream("config.properties");
		prop.load(input);

		ConfigProp = new Properties();
		ConfigInput = new FileInputStream("config.properties");
		ConfigProp.load(ConfigInput);
	}

	public HubCreator() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		
		HubCreator hc = new HubCreator();
		hc.loadProperties();
		
		File hub= new File("D:\\MobileBaseProjectRepository\\Grid");
		hub.mkdir();
		
		
		
		
		File hubConfig=new File("D:\\MobileBaseProjectRepository\\Grid\\hubConfig.json");
		File hubBat=new File("D:\\MobileBaseProjectRepository\\Grid\\starthub.bat");
		
		FileWriter hubConfigWriter = new FileWriter(hubConfig);
		BufferedWriter hubConfigBufferedWriter = new BufferedWriter(hubConfigWriter);
		
		hubConfigBufferedWriter.write("{\"_comment\" : \"Configuration for Hub - hubConfig.json\",");
		hubConfigBufferedWriter.write("\"host\": "+hc.prop.getProperty("hubHost")+",");
		hubConfigBufferedWriter.newLine();
		hubConfigBufferedWriter.write("\"maxSessions\": 5,");
		hubConfigBufferedWriter.newLine();
		hubConfigBufferedWriter.write("\"port\": 4444,");
		hubConfigBufferedWriter.newLine();
		hubConfigBufferedWriter.write("\"cleanupCycle\": 5000,");
		hubConfigBufferedWriter.newLine();
		hubConfigBufferedWriter.write("\"timeout\": 300000,");
		hubConfigBufferedWriter.newLine();
		hubConfigBufferedWriter.write("\"newSessionWaitTimeout\": -1,");
		hubConfigBufferedWriter.newLine();
		hubConfigBufferedWriter.write("\"prioritizer\": null,");
		hubConfigBufferedWriter.newLine();
		hubConfigBufferedWriter.write("\"capabilityMatcher\": \"com.aqm.hubCapability.SmartPhoneCapabilityMatcher\",");
		hubConfigBufferedWriter.newLine();
		hubConfigBufferedWriter.write("\"throwOnCapabilityNotPresent\": true,");
		hubConfigBufferedWriter.newLine();
		hubConfigBufferedWriter.write("\"nodePolling\": 180000,");
		hubConfigBufferedWriter.newLine();
		hubConfigBufferedWriter.write("\"platform\": \"ANDROID\"}");
		hubConfigBufferedWriter.flush();
		
		FileWriter batWriter = new FileWriter(hubBat);
		BufferedWriter batBufferedWriter = new BufferedWriter(batWriter);
		
		batBufferedWriter.write("java -cp *;. org.openqa.grid.selenium.GridLauncher -role hub -hubConfig hubConfig.json");
		batBufferedWriter.newLine();
		batBufferedWriter.write("pause");
		batBufferedWriter.flush();
		
		System.out.println("starthub.bat and hubConfig.json has been created successfully in "+hub.toString());
		
	}

}
