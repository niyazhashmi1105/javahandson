package com.java.programs;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class GetFirstNonRepeatedChar {

	public static void main(String[] args) {
		
		String str= "aaabbbcdeff";
		char ch= getFirstNonRepeatedChar(str);
		System.out.println("First non repeated character = "+ ch);
	}

	private static char getFirstNonRepeatedChar(String str) {
		Map<Character,Integer> countMap = new LinkedHashMap<Character,Integer>();
		
		for(char ch: str.toCharArray()) {
			/*
			 * if(!countMap.containsKey(ch)) countMap.put(ch, 1); else countMap.put(ch,
			 * countMap.get(ch)+1);
			 */
			countMap.put(ch, countMap.containsKey(ch)?countMap.get(ch)+1:1);
		}
		
		for(Entry<Character, Integer> entry: countMap.entrySet()) {
			if(entry.getValue()==1)
				return entry.getKey();
		}
		
		throw new RuntimeException("unable to get any first non repeated character") ;
	}

}
