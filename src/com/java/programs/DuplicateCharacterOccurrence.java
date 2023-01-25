package com.java.programs;

import java.util.HashMap;
import java.util.Map;


public class DuplicateCharacterOccurrence {

	public static void main(String[] args) {
		
		String s= "Automation Javaaa Selenium";
		getDuplicateCharacterOccurrences(s);
	}
	
	private static void getDuplicateCharacterOccurrences(String str) {
		
		
		Map<Character,Integer> map = new HashMap<>();
		str=str.toLowerCase();
		char [] ch = str.toCharArray();
		
		for(char c:ch) {
			if(!map.containsKey(c)) 
				map.put(c, 1);
			else
				map.put(c, map.get(c)+1);
		}
		for(Map.Entry<Character,Integer> entry: map.entrySet()) {
				
				if(entry.getValue()>1)
					System.out.println(entry.getKey()+" occurs "+ entry.getValue()+" times" );
				
			
		}
	}

}
