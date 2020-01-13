package com.aqm.device.logging;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class DeviceLogger implements Runnable {
	
	private LogMonitor logger;

	

	public DeviceLogger(LogMonitor logger) {
		this.logger=logger;
	}


	public LogMonitor getLogger() {
		return logger;
	}


	@SuppressWarnings("resource")
	public void startLogging() throws UnknownHostException, IOException {
		
		InetAddress addr = InetAddress.getByName(getLogger().getNodeMachineIP());
		System.out.println("node machine IP is "+getLogger().getNodeMachineIP());
		System.out.println("InetAddress is "+addr.getHostAddress());
		//Client client = new Client(this.getLogger(), addr,1234);
		//Client client = new Client(this.getLogger(), addr,5129);
		Client client = new Client(this.getLogger(), addr,5787);
		System.out.println("Client Created.");
		client.clientSendingLogMonitor();
	}
	
	
	
	@SuppressWarnings("resource")
	public  void stopLogging() throws IOException{
		InetAddress addr = InetAddress.getByName(getLogger().getNodeMachineIP());
		//Client client = new Client(this.getLogger(), addr,1234);
		//Client client = new Client(this.getLogger(), addr,5129);
		Client client = new Client(this.getLogger(), addr,5787);
		/**********Changes made by furhat on 7th March 2018 as the application was throwing exception while writing deviceId(java.net.SocketException: Software caused connection abort: socket write error)********/
		//client.clientSendingTurnOffSignal(this.getLogger().getDeviceID());
		String deviceId=this.getLogger().getDeviceID();
		client.clientSendingTurnOffSignal(deviceId);
		/**********Changes made by furhat on 7th March 2018 as the application was throwing exception while writing deviceId(java.net.SocketException: Software caused connection abort: socket write error)********/
		
		System.out.println("Sending Instruction of Logging off to "+client.getInetAddress().getHostAddress());
		
		//this.client.clientReceivingLogFile(this.getLogger().getDeviceID());
	}

	@SuppressWarnings("resource")
	public  void getLog() throws IOException{
		InetAddress addr = InetAddress.getByName(getLogger().getNodeMachineIP());
		//Client client = new Client(this.getLogger(), addr,1234);
		//Client client = new Client(this.getLogger(), addr,5129);
		Client client = new Client(this.getLogger(), addr,5787);
		String deviceId=this.getLogger().getDeviceID();
		//client.clientReceivingLogFile(this.getLogger().getDeviceID());
		client.clientReceivingLogFile(deviceId);
		
		System.out.println("Sending Instruction for retrieval of Log File to "+client.getInetAddress().getHostAddress());
		
	}
	


	@Override
	public void run() {/*
		try {
			System.out.println("Logging Instruction received.");
			startLogging();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	*/}

}
