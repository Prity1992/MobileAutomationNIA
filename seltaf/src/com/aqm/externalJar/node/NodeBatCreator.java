package com.aqm.externalJar.node;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.commons.lang3.RandomUtils;

public class NodeBatCreator {		
		
	/*	node.exe "C:\Program Files (x86)\Appium\node_modules\appium\bin\appium.js" --address 192.168.1.132 --port 4728 --bootstrap 2257 -U 0123456789ABCDEF --platform-version 4.4.2 --nodeconfig D:\Users\NIA\Desktop\LocalMachine\nodeconfig6.json --session-override*/
		
		public void createNodeBat(ArrayList<StringBuilder> dataRow,String nodeJsonFile,File batFile) throws IOException{
			
			String nodeURL=dataRow.get(1).toString();
			Integer port=RandomUtils.nextInt(4800,7000);
			String portString = port.toString();
			String bootstrapString = portString;
			String udidAsPerADB=dataRow.get(4).toString();

			FileWriter nodeBatWriter = new FileWriter(batFile);
			BufferedWriter nodeBatBufferedWriter = new BufferedWriter(nodeBatWriter);
			nodeBatBufferedWriter.write("node.exe \"C:\\Program Files (x86)\\Appium\\node_modules\\appium\\bin\\appium.js\" --address ");
			nodeBatBufferedWriter.write(nodeURL);
			nodeBatBufferedWriter.write(" --port ");
			nodeBatBufferedWriter.write(portString);
			nodeBatBufferedWriter.write(" --bootstrap ");
			nodeBatBufferedWriter.write(bootstrapString);
			nodeBatBufferedWriter.write(" -U ");
			nodeBatBufferedWriter.write(udidAsPerADB);
			nodeBatBufferedWriter.write(" --nodeconfig ");
			nodeBatBufferedWriter.write(nodeJsonFile);
			nodeBatBufferedWriter.write(" --session-override");
			nodeBatBufferedWriter.flush();
		
		
		
		
		
	}

}
