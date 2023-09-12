package com.java.programs;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWords {

	public static void main(String[] args) {
		
		  String str ="I am a developer developer in a tesla";
		    Map<String,Integer> map = new HashMap<>();
		    String []words = str.split(" ");
		    
		    for(String word:words){
		        
		        if(!map.containsKey(word)){
		        	map.put(word,1);
		            
		        }
		        else
		        	map.put(word,map.get(word)+1); 
		      }
		    for(Map.Entry<String,Integer> entry: map.entrySet()){
		        if(entry.getValue()>1)
		            System.out.println(entry.getKey()+" --> "+entry.getValue());
		    }
		        

	}

}
