package com.aqm.device.logging;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class BatchFileRunner extends Thread{

	private volatile  Boolean stopLogging = true;
	private LogMonitor logMonitor;
	

	public BatchFileRunner(LogMonitor logMonitor) {
		this.logMonitor = logMonitor;
	}

	public synchronized Boolean getStopLogging() {
		return this.stopLogging;
	}

	public synchronized void setStopLogging(Boolean stopLogging) {
		this.stopLogging = stopLogging;
	}

	@Override
	public void run() {
		Process proc=null;
		File txtFile=null;
		BufferedReader in=null;
		BufferedWriter txtBufferedWriter=null;
		FileWriter txtWriter=null;
		
		try{

		String packageName = logMonitor.getPackageName();
		String deviceID = logMonitor.getDeviceID();
		String rootFolderPath = logMonitor.getRootFolderPath();
		String pattern = Pattern.quote(System.getProperty("file.separator"));
		String[] splittedFileName = rootFolderPath.split(pattern);
		String resultFolder = splittedFileName[2];
		
		File resultFolderOnFileSystem = new File(rootFolderPath);
		if (!(resultFolderOnFileSystem.exists())) {
			resultFolderOnFileSystem.mkdir();
			System.out.println("Folder Created: " + resultFolder);
		}

		String rootDeviceLoggerFolder = rootFolderPath + "\\DeviceLoggingCenter";

		File rootResultFolder = new File(rootDeviceLoggerFolder);
		if (!(rootResultFolder.exists()))
			rootResultFolder.mkdir();
		String deviceIDinFile = deviceID.replace(".", "_");
		deviceIDinFile = deviceIDinFile.split(":")[0];
		File batFile = new File(rootDeviceLoggerFolder + "\\device_log_" + deviceIDinFile + ".bat");

		FileWriter batWriter = new FileWriter(batFile);
		BufferedWriter batBufferedWriter = new BufferedWriter(batWriter);
		batBufferedWriter.write("@echo Off");
		batBufferedWriter.newLine();
		batBufferedWriter.write("adb -s " + deviceID + " logcat | findstr " + packageName);
		batBufferedWriter.flush();
		batBufferedWriter.close();

		proc = Runtime.getRuntime().exec(batFile.getAbsolutePath());
		in = new BufferedReader(new InputStreamReader(proc.getInputStream()));

		String id = deviceID.replace(".", "_");
		id = id.split(":")[0];

		String rootDeviceLogFolder = rootFolderPath + "\\Device_Logs";

		File deviceLoggingFolder = new File(rootDeviceLogFolder);
		if (!(deviceLoggingFolder.exists()))
			deviceLoggingFolder.mkdir();

		txtFile = new File(rootDeviceLogFolder + "\\device_RT_Logging_" + id + ".txt");

		txtWriter = new FileWriter(txtFile);

		txtBufferedWriter = new BufferedWriter(txtWriter);

		String line;
		// System.out.println(in);

		while (!Thread.interrupted()) {
			line = in.readLine();
			// System.out.println(line);
			if (line != null) {
				txtBufferedWriter.write(line);
				txtBufferedWriter.newLine();
			}
		}

		}
		
		catch(Exception e){
			proc.destroy();
			System.out.println("Log File Path: " + txtFile.getAbsolutePath());
			try {
				in.close();
				txtBufferedWriter.flush();
				txtBufferedWriter.close();
				txtWriter.flush();
				txtWriter.close();
			} catch (IOException io) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		

	}


	
	

}