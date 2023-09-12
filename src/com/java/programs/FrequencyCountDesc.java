package com.java.programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Comparator;

public class FrequencyCountDesc {

	public static void main(String[] args) {
		
		String str = "banana";
		getFrequencyCountAscOrder(str);
	}

	private static void getFrequencyCountAscOrder(String str) {
	
		Map<Character,Integer> map = new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			Integer ch= map.get(str.charAt(i));
			
			if(ch== null) 
				map.put(str.charAt(i),1);
			else
				map.put(str.charAt(i),++ch);
				
		}
		/*
		 * Set<Entry<Character,Integer>> set = map.entrySet();
		 * List<Entry<Character,Integer>> list = new ArrayList<>(set);
		 * Collections.sort(list, new Comparator<>(){
		 * 
		 * @Override public int compare(Entry<Character,Integer>
		 * o1,Entry<Character,Integer> o2) {
		 * 
		 * return o2.getValue().compareTo(o1.getValue()); }});
		 */
		
		for(Entry<Character,Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	
	}

}
