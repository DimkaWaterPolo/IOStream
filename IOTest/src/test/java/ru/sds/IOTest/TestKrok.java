package ru.sds.IOTest;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestKrok {

	
	    public static void main(String[] args) {
	    	
	        Scanner scanner = new Scanner(System.in);
	        String buff ;
	       
	        List<String> list = new ArrayList<String>();
	        List<String> list1 = new ArrayList<String>();
	        
	        while(scanner.hasNextLine()) {
	        	buff= scanner.nextLine();
	        	list.add(buff);
	        }
	        
	        String str;
	        int spaceCount=0;
	        for(int i = 0; i< list.size();i++) {
	        	str = list.get(i).trim();
	        	
	        	if(str.startsWith("}")) {
	        		spaceCount= spaceCount-4;
	        	}
	        	list1.add(getSpace(spaceCount) + str);
	        	
	        	if(str.endsWith("{")) {
	        		spaceCount = spaceCount +4;
	        	}
	        	
	   
	        }
	  
	        
	        for(int i = 0; i< list1.size();i++) {
	        	System.out.println(list1.get(i));
	        }
	        	
	        }
	     
	  private static String getSpace(int count)  {
		  String str = "";
		  for (int i = 0; i < count; i++) {
			  str = str + " ";
		  }
		  return str;
	  }
	  
	

}
