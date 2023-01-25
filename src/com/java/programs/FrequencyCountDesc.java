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
		getFrequencyCountDescOrder(str);
	}

	private static void getFrequencyCountDescOrder(String str) {
	
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for(int i=0;i<str.length();i++) {
			Integer ch= map.get(str.charAt(i));
			
			if(map.get(str.charAt(i))== null) 
				map.put(str.charAt(i),1);
			else
				map.put(str.charAt(i),++ch);
				
		}
		Set<Entry<Character,Integer>> set = map.entrySet();
		List<Entry<Character,Integer>> list = new ArrayList<Entry<Character,Integer>>(set);
		Collections.sort(list, new Comparator<Map.Entry<Character,Integer>>(){
				
			@Override
			public int compare(Entry<Character,Integer> o1,Entry<Character,Integer> o2) {
		
				return o2.getValue().compareTo(o1.getValue());
	}});
		
		for(Entry<Character,Integer> entry:list) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	
	}

}
