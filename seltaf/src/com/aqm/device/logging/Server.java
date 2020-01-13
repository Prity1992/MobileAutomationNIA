package com.aqm.device.logging;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class Server {
	
    @SuppressWarnings("null")
	public static void main(String[] args) {
    	
    	HashMap<String,BatchFileRunner> mapOfDevices = new HashMap<String,BatchFileRunner>();
    	
    	
        try {
        	
        	InetAddress addr = InetAddress.getByName(args[0]);
        	@SuppressWarnings("resource")
			ServerSocket server = new ServerSocket(1234, 50, addr);
            
            while (true) {
            	
            	System.out.println("Server is ready for connection.");
            	Socket client = server.accept();
            	System.out.println("Connection Received from "+client.getInetAddress());
                ObjectInputStream flag = new ObjectInputStream(client.getInputStream());
                //ObjectOutputStream fileSender = new ObjectOutputStream(client.getOutputStream());
                String serverFlag = (String) flag.readObject();
                System.out.println("Request Received from "+client.getInetAddress()+" for " +serverFlag);
                		
                switch(serverFlag){
                
                case "logMonitor":
                	System.out.println("<<<<<LOGGING STARTING>>>>>>");
                	LogMonitor lm = (LogMonitor) flag.readObject();
                	BatchFileRunner bfr = new BatchFileRunner(lm);
                	mapOfDevices.put(lm.getDeviceID(),bfr);
                	bfr.start();
                	System.out.println("Logging Started for :"+lm.getDeviceID());
                	System.out.println(mapOfDevices.toString());
                	break;
                	
				case "turnOffSignal":
					System.out.println("<<<<<LOGGING OFF>>>>>>");
                	String deviceID = (String) flag.readObject();
                	System.out.println("Turn off Request received for :"+deviceID);
                	BatchFileRunner currentRunnerToStop = mapOfDevices.get(deviceID);
                	System.out.println("Currently executing Runner :"+currentRunnerToStop.toString());
                	currentRunnerToStop.setStopLogging(false);
                	System.out.println("Logging Stopped :"+deviceID);
                	System.out.println(mapOfDevices.toString());
                	break;
                	
                	
                case "logFile":
                	System.out.println("<<<<<LOGGING INTO FILE>>>>>>");
                	deviceID = (String) flag.readObject();
                	System.out.println("Log File Request received for "+deviceID);
                	/*BatchFileRunner currentRunnerToLogFile = mapOfDevices.get(deviceID);
                	File file = currentRunnerToLogFile.logFile;
                	System.out.println("Log file path is "+file.getAbsolutePath());
                	System.out.println("Currently executing Runner :"+currentRunnerToLogFile.toString());
                	fileSender.writeObject(file);
                	System.out.println("Log file sent for :"+deviceID);*/
                	break;
                }
                	
             }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}