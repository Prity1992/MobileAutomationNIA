package com.aqm.hubCapability;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


 
import org.openqa.grid.internal.utils.DefaultCapabilityMatcher;
 
public class SmartPhoneCapabilityMatcher extends DefaultCapabilityMatcher {

    @Override
    public boolean matches(Map<String, Object> nodeCapability, Map<String, Object> requestedCapability) {
    	
	HashMap<String,Object> nodeCapabilityAvailable = new HashMap<String,Object>();
	HashMap<String,Object> requestedCapabilityAvailable = new HashMap<String,Object>();
	
	ArrayList<String> listOfParam = new ArrayList<String>();
	
	listOfParam.add("DeviceManufacturer");
	listOfParam.add("DeviceModel");
	listOfParam.add("DeviceOS");
	listOfParam.add("OSVersion");
	listOfParam.add("DeviceType");
	listOfParam.add("deviceName");
	
	System.out.println("List of Parameters for verification:");
    for(String param:listOfParam){
    	if(nodeCapability.containsKey(param)){
    		System.out.println("");
    		System.out.print("nodeCapability Map have a key called: "+param);
    		nodeCapabilityAvailable.put(param,(String) nodeCapability.get(param));
    		System.out.print(" and value of that key is "+(String) nodeCapability.get(param));
    		
    	}
    }
    
    System.out.println("");
    
    for(String param:listOfParam){
    	if(requestedCapability.containsKey(param)){
    		System.out.println("");
    		System.out.print("requestedCapability Map have a key called: "+param);
    		requestedCapabilityAvailable.put(param,(String) requestedCapability.get(param));
    		System.out.print(" and value of that key is "+(String) requestedCapability.get(param));
    	}
    }
    
    
    boolean basicChecks=false;
    
    /*= super.matches(nodeCapability, requestedCapability);
    
    if(basicChecks){
    System.out.println("Matching of basic check on all capability between nodeCapability and requestedCapability is Passed.");
    }
    */
    
    System.out.println("");
    
    int x=1;
    if(!basicChecks){
    	 for(String param:listOfParam){
    	if(requestedCapabilityAvailable.containsKey(param)){
    		if(nodeCapabilityAvailable.containsKey(param)){
    			if(((String) requestedCapabilityAvailable.get(param)).equalsIgnoreCase(((String) nodeCapabilityAvailable.get(param)))){
    				basicChecks=true;
    				System.out.println("Found match "+x+":"+param);
    				x++;
    			}else{
    				basicChecks=false;
    				System.out.println("mismatch of values found for "+param+" ,hence Test will not be sent for execution.");
    				break;
    			}
    		}
    	}
    	}
    }	
    
    if(basicChecks)
    	System.out.println("All values are matched between nodeCapability MAP and requestedCapability MAP.");
    
        return basicChecks;
    }
 
}