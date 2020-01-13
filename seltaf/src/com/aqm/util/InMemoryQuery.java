package com.aqm.util;

import java.util.ArrayList;

public class InMemoryQuery {

	public InMemoryQuery() {
		
	}
	
	
	public static Integer getcolumnNumberIndexSearch(ArrayList<ArrayList<StringBuilder>> table,StringBuilder criteriaColumnName){
	
		Integer columnNumberIndexSearch=0;
		
		ArrayList<StringBuilder> headerRowFromTable=table.get(0);
				for(StringBuilder headerColumnValue:headerRowFromTable){
					headerColumnValue.trimToSize();
					criteriaColumnName.trimToSize();
					if(headerColumnValue.toString().equalsIgnoreCase((criteriaColumnName.toString()))){
						break;
					}
					columnNumberIndexSearch++;
				}
		
		return columnNumberIndexSearch;
		
	}

	public static StringBuilder[] getTableDataOnCriteria(ArrayList<ArrayList<StringBuilder>> table,StringBuilder targetCoulmnName,StringBuilder criteriaColumnName,StringBuilder criteriaValue) {
		Integer retainedLineNumber;
		StringBuilder[] stringBuilderArrayToReturn;
		return null;
	}
	
	
	
	//mini table---Internal table-- Single criteria
	public static ArrayList<ArrayList<StringBuilder>> getRowDataOnCriteria(ArrayList<ArrayList<StringBuilder>> table,StringBuilder criteriaColumnName,ArrayList<StringBuilder> criteriaValues){
		
		ArrayList<ArrayList<StringBuilder>> miniTableToReturn = new ArrayList<ArrayList<StringBuilder>>();
		ArrayList<StringBuilder> rowStrings = new ArrayList<StringBuilder>();
		
		Integer columnNumberIndexSearch = getcolumnNumberIndexSearch(table,criteriaColumnName);
		
		for(ArrayList<StringBuilder> eachRow : table)
		{
			String checkValue = eachRow.get(columnNumberIndexSearch).toString();
			for(StringBuilder criteria:criteriaValues){
				if(criteria.toString().equals(checkValue))
				{
					miniTableToReturn.add((ArrayList<StringBuilder>) eachRow.clone());
				}	
			}
		}
		return miniTableToReturn;
	}

	//mini table---Internal table-- Double criteria
		public static ArrayList<ArrayList<StringBuilder>> getRowDataOnCriteria(ArrayList<ArrayList<StringBuilder>> table,StringBuilder criteria1ColumnName,ArrayList<StringBuilder> criteria1Values,StringBuilder criteria2ColumnName,ArrayList<StringBuilder> criteria2Values){
			
			ArrayList<ArrayList<StringBuilder>> miniTableOfCriteria1 = new ArrayList<ArrayList<StringBuilder>>();
			ArrayList<ArrayList<StringBuilder>> miniTableOfCriteria2 = new ArrayList<ArrayList<StringBuilder>>();
			
			miniTableOfCriteria1=getRowDataOnCriteria(table,criteria1ColumnName,criteria1Values);
			
			miniTableOfCriteria1.add(0, table.get(0));
			
			miniTableOfCriteria2=getRowDataOnCriteria(miniTableOfCriteria1,criteria2ColumnName,criteria2Values);
		
			
			return miniTableOfCriteria2;
			
		}
		
		
		
		public static ArrayList<StringBuilder> getRowNumberArrayBasedOnCriteria(ArrayList<ArrayList<StringBuilder>> table,StringBuilder criteriaColumnName,StringBuilder criteriaValue){
			Integer columnNumberIndexSearch = getcolumnNumberIndexSearch(table,criteriaColumnName);
					
			ArrayList<StringBuilder> rowNumberStringBuilderToReturn = new ArrayList<StringBuilder>();
			for(ArrayList<StringBuilder> eachRow:table){
				if(criteriaValue.toString().equalsIgnoreCase(eachRow.get(columnNumberIndexSearch).toString())){
					rowNumberStringBuilderToReturn.add(new StringBuilder(eachRow.get(0).toString()));
				}	
			}
			return rowNumberStringBuilderToReturn;
		}
}
