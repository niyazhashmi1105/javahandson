package com.java.programs;


import java.util.LinkedHashMap;
import java.util.Map;


public class CompressedString {

	public static void main(String[] args) {
		
		String str="abbccc";
		getCompressedString(str);

	}

	private static void getCompressedString(String str) {
		
		Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			Integer ch= map.get(str.charAt(i));
			
			if(map.get(str.charAt(i))== null) 
				map.put(str.charAt(i),1);
			else
				map.put(str.charAt(i),++ch);
				
		}
		
		for (Map.Entry<Character,Integer> entry:map.entrySet()) {
			sb.append(entry.getKey());
			sb.append(entry.getValue());
		}
		System.out.println(sb.toString());
		
	}

}
