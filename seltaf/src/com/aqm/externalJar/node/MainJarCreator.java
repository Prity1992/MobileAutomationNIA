package com.aqm.externalJar.node;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.commons.io.FileUtils;

import com.aqm.externalJar.node.ConfigJsonCreator;

import com.aqm.util.InMemoryQuery;

public class MainJarCreator {

	public MainJarCreator() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		ArrayList<String> Filesnames= new ArrayList<String>();
		ArrayList<String> batFilesList= new ArrayList<String>();
		
		
		
		ExcelToStringArray generate = new ExcelToStringArray();
		try {
			generate.GetSheetInStringArray("D:\\MobileBaseProjectExcelData\\0000_MasterTestSuite.xlsx","rId10");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		ArrayList<ArrayList<StringBuilder>> stringArraytoCreateFiles = InMemoryQuery.getRowDataOnCriteria(
				generate.stringArrayToReturn,
				new StringBuilder("0"),
				InMemoryQuery.getRowNumberArrayBasedOnCriteria(generate.stringArrayToReturn,
						new StringBuilder("NodeMachineIP"),
						new StringBuilder(args[0])),
				new StringBuilder("0"),
				InMemoryQuery.getRowNumberArrayBasedOnCriteria(generate.stringArrayToReturn,
						new StringBuilder("UseForExecution"),
						new StringBuilder("Yes")));
		
		
		File NodeFolder = new File("D:\\MobileBaseProjectRepository\\Grid\\Node");
		
		if(NodeFolder.exists()){
			try {
				FileUtils.deleteDirectory(NodeFolder);
				FileUtils.forceMkdir(NodeFolder);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}else{
			try {
				FileUtils.forceMkdir(NodeFolder);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		int FileCounter=1;
		for(ArrayList<StringBuilder> eachRow:stringArraytoCreateFiles){
			
			String FileName=args[0];
			
			
			
			String JsonFileQualifiedName="D:\\MobileBaseProjectRepository\\Grid\\Node\\"+"nodeConfig_"+FileName+"_"+FileCounter+".json";
			String BatFileQualifiedName="D:\\MobileBaseProjectRepository\\Grid\\Node\\"+"startnode_"+FileName+"_"+FileCounter+".bat";
			
			Filesnames.add(JsonFileQualifiedName);
			Filesnames.add(BatFileQualifiedName);
			batFilesList.add(BatFileQualifiedName);
			
			
			File JsonFile= new File(JsonFileQualifiedName);
			File NodeBatFile= new File(BatFileQualifiedName);
			
				
			
			try {
				new ConfigJsonCreator().createJson(eachRow, JsonFile);
				new NodeBatCreator().createNodeBat(eachRow, JsonFileQualifiedName, NodeBatFile);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
			FileCounter++;
			
			
			
		}
		
		int count=1;
		System.out.println("Following Files are created:");
		
		for(String file:Filesnames){
			System.out.println(count+".)"+file);
			count++;
		}
		
		File allNodeStart = new File("D:\\MobileBaseProjectRepository\\Grid\\StartAllNodes.bat");
		
		FileWriter allNodeStartFileWriter;
		try {
			allNodeStartFileWriter = new FileWriter(allNodeStart);
			@SuppressWarnings("resource")
			BufferedWriter allNodeStartBufferedWriter = new BufferedWriter(allNodeStartFileWriter);
			
			for(String eachLine:batFilesList){
			
				allNodeStartBufferedWriter.write("start "+eachLine);
				allNodeStartBufferedWriter.newLine();
			
			}
			allNodeStartBufferedWriter.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
