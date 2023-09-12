package com.java.programs;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

	public static void main(String[] args) {
		
		Map<Integer,Integer> map = new HashMap<>();
		int []arr= {10,10,30,20,50,60};
	
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
			
		}
		//System.out.println(map);
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			
			//System.out.println(entry.getValue()+" "+ arr.length/2);
			if(entry.getValue()>= (arr.length-1)/2) {
				int result = entry.getKey();
				System.out.println(result);
				
			}
			
		}
		
		
		
		
		

	}

}
