package com.java.programs;


import java.util.LinkedHashMap;
import java.util.Map;


public class CompressedString {

	public static void main(String[] args) {
		
		String str="abbccc";
		System.out.println(getCompressedString(str));

	}

	private static String getCompressedString(String str) {
		
		Map<Character,Integer> map = new LinkedHashMap<>();
		StringBuilder sb = new StringBuilder();
		
		for(int i=0;i<str.length();i++) {
			Integer ch= map.get(str.charAt(i));
			
		if(ch== null) 
				map.put(str.charAt(i),1);
			else
				map.put(str.charAt(i),++ch);
				
		}
		
		for (Map.Entry<Character,Integer> entry:map.entrySet()) {
			sb.append(entry.getKey());
			sb.append(entry.getValue());
		}
		//System.out.println(sb.toString());
		return sb.toString();
		
	}

}
