package com.java.programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubStringAndLength {

	public static void main(String[] args) {

		String str = "abcda";
		getLongestSubStringAndLength(str);

	}

	private static void getLongestSubStringAndLength(String str) {
	
		String longestSubString= null;
		int longestSubStringLength=0;
		
		Map<Character,Integer> map = new LinkedHashMap<>();
		char []arr = str.toCharArray();
		
		for(int i=0;i<arr.length;i++) {
			
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], 1); //a-1 b-1 c-1 d-1
			}
			else {
					i = map.get(arr[i]);
					map.clear();
				 }
			
			if(map.size() > longestSubStringLength) {
				longestSubStringLength = map.size();
				longestSubString = map.keySet().toString();
				
			}
		}
		
		System.out.println(longestSubString+"---> "+longestSubStringLength);
		
	}

}
