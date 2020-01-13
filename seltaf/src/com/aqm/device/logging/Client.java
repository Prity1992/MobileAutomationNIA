package com.aqm.device.logging;

import java.net.*;
import java.io.*;

public class Client extends Socket {
	
	private LogMonitor lm;
	private String serverFlag;
	private ObjectOutputStream objectOut;
	private ObjectInputStream objectIn;
	
	public Client(LogMonitor lm,InetAddress addr,int port) throws UnknownHostException, IOException{
		
		super(addr.getHostAddress(),port);
		System.out.println("Client Constructor execution begins.");
        this.lm = lm;
         objectOut = new ObjectOutputStream(this.getOutputStream());
         //objectIn = new ObjectInputStream(this.getInputStream());         
         System.out.println("Client Constructor completed.");
	
	}
	
	@Override
	public String toString(){
		return this.serverFlag;
	}
	
	
	
    public void clientSendingLogMonitor() {
        try {
        	serverFlag = "logMonitor";
        	System.out.println("Client Sending Objects to Server:"+serverFlag);
        	
        	/**********Changes made by furhat on 7th March 2018 as the application was throwing exception while writing deviceId(java.net.SocketException: Software caused connection abort: socket write error)********/
           // objectOut.writeObject(serverFlag);
            //objectOut.flush();//added by furhat
        	//I have confirmed abt commenting lm object of LogMonitor class from Swapnil.
        	//As discussed with Swapnil LogMonitor is not used hence that can be commented
            //objectOut.writeObject(lm);//added by furhat
            //objectOut.flush();
        	/**********Changes made by furhat on 7th March 2018 as the application was throwing exception while writing deviceId(java.net.SocketException: Software caused connection abort: socket write error)********/
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void clientSendingTurnOffSignal(String deviceID) {
        try {
        	serverFlag = "turnOffSignal"; 
            //objectOut.writeObject(serverFlag);
          //  objectOut.flush();
        	
        	/**********Changes made by furhat on 7th March 2018 as the application was throwing exception while writing deviceId(java.net.SocketException: Software caused connection abort: socket write error)********/
            objectOut.writeObject(deviceID);
            objectOut.flush();
            System.out.println("Stop Logging Signal for "+deviceID);
            /**********Changes made by furhat on 7th March 2018 as the application was throwing exception while writing deviceId(java.net.SocketException: Software caused connection abort: socket write error)********/
            
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    

    public void clientReceivingLogFile(String deviceID) {
        try {
        	serverFlag = "logFile";
        	/**********Changes made by Furhat on 7th March 2018 as the application was throwing exception while writing deviceId(java.net.SocketException: Software caused connection abort: socket write error)********/
            //objectOut.writeObject(serverFlag);
            //objectOut.flush();//added by Furhat
        	/**********Changes made by Furhat on 7th March 2018 as the application was throwing exception while writing deviceId(java.net.SocketException: Software caused connection abort: socket write error)********/
            objectOut.writeObject(deviceID);
            objectOut.flush();//added by Furhat
            File logFile = (File) objectIn.readObject();
            System.out.println("Log File Object ID " + logFile);
            objectIn.close();
            System.out.println("Log File Received for "+deviceID);
            System.out.println("Log file path" + logFile.getAbsolutePath());
            FileWriter w = new FileWriter(logFile);
            BufferedWriter bw = new BufferedWriter(w);
            bw.flush();
            bw.close();
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    
}